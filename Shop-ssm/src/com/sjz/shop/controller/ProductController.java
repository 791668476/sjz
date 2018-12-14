package com.sjz.shop.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sjz.shop.pojo.Cart;
import com.sjz.shop.pojo.CartItem;
import com.sjz.shop.pojo.Category;
import com.sjz.shop.pojo.Product;
import com.sjz.shop.pojo.User;
import com.sjz.shop.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/index")
	public String list(Model model){
		List<Product> hotProductList = productService.findHotProductList();
		List<Product> newProductList = productService.findNewProductList();
		model.addAttribute("hotProductList", hotProductList);
		model.addAttribute("newProductList",newProductList);
		return "index";		
	}
	
	@RequestMapping(value="/product")
	public String product(HttpServletRequest request,HttpServletResponse response,Integer pid,Model model){
		Product product = productService.findProduct(pid);
		model.addAttribute("product", product);
		
		
		String pids = pid+"";
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for(Cookie cookie : cookies){
				if("pids".equals(cookie.getName())){
					pids = cookie.getValue();
					//1-3-2 本次访问商品pid是8----->8-1-3-2
					//1-3-2 本次访问商品pid是3----->3-1-2
					//1-3-2 本次访问商品pid是2----->2-1-3
					//将pids拆成一个数组
					String[] split = pids.split("-");//{3,1,2}
					List<String> asList = Arrays.asList(split);//[3,1,2]
					LinkedList<String> list = new LinkedList<String>(asList);//[3,1,2]
					//判断集合中是否存在当前pid
					if(list.contains(pid+"")){
						//包含当前查看商品的pid
						list.remove(pid);
						list.addFirst(pid+"");
					}else{
						//不包含当前查看商品的pid 直接将该pid放到头上
						list.addFirst(pid+"");
					}
					//将[3,1,2]转成3-1-2字符串
					StringBuffer sb = new StringBuffer();
					for(int i=0;i<list.size()&&i<7;i++){
						sb.append(list.get(i));
						sb.append("-");//3-1-2-
					}
					//去掉3-1-2-后的-
					pids = sb.substring(0, sb.length()-1);
				}
			}
		}
		Cookie cookie_pids = new Cookie("pids",pids);
		response.addCookie(cookie_pids);
		
		return "product_info";
	}
	
	@RequestMapping(value="/addProductToCart")
	public String addProductToCart(Integer pid,Integer buyNum,HttpServletRequest request,Model model){
		HttpSession session = request.getSession();
		
		User user = (User) session.getAttribute("user");
		
		if(user!=null){
			
			Product product = productService.findProduct(pid);
			int shop_price = (int) product.getShop_price();
			double subtotal=(double) (shop_price*buyNum);
			
			CartItem cartItem = new CartItem();
			cartItem.setBuyNum(buyNum);
			cartItem.setProduct(product);
			cartItem.setSubtotal(subtotal);
			
			Cart cart = (Cart) session.getAttribute("cart");
			if(cart==null){
				cart=new Cart();
			}
			Map<String, CartItem> cartItems = cart.getCartItems();
			double newsubtotal = 0.0;
			if(cartItems.containsKey(pid+"")){
				CartItem cart_Item = cartItems.get(pid+"");
				int oldBuyNum = cart_Item.getBuyNum();
				oldBuyNum=oldBuyNum+buyNum;
				cart_Item.setBuyNum(oldBuyNum);
				cart.setCartItems(cartItems);
				
				
				double oldsubtotal = cart_Item.getSubtotal();
				newsubtotal=buyNum*product.getShop_price();
				cart_Item.setSubtotal(newsubtotal+oldsubtotal);
				
			}else{
				cartItems.put(product.getPid(), cartItem);
				newsubtotal = buyNum*product.getShop_price();
			}
			
			double total=cart.getTotal()+newsubtotal;
			cart.setTotal(total);
			session.setAttribute("cart", cart);
			model.addAttribute("cart", cart);
			
			return "cart";
			
		}else{
			return "login";
		}
		
		
		
	}
	
	@RequestMapping(value="/delProFromCart")
	public String delProFromCart(Integer pid,HttpServletRequest request){
		
		HttpSession session = request.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		if(cart!=null){
			Map<String, CartItem> cartItems = cart.getCartItems();
			cart.setTotal(cart.getTotal()-cartItems.get(pid+"").getSubtotal());
			cartItems.remove(pid+"");
			cart.setCartItems(cartItems);
		}
		session.setAttribute("cart", cart);
		
		return "cart";
	}
	//清空购物车
	@RequestMapping(value="/clearCart")
	public String clearCart(HttpServletRequest request){
		HttpSession session = request.getSession();
		session.removeAttribute("cart");
		return "cart";
	}
	//提交订单
	@RequestMapping(value="/submitOrder")
	public String submitOrder(HttpServletRequest request,Model model){
		HttpSession session = request.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		model.addAttribute("cart", cart);
		return "order_info";
	}
	//确认订单
	@RequestMapping(value="/confirmOrder")
	public String confirmOrder(){
		return "success";
	}
	//获取商品分类
	@RequestMapping(value="/categoryList")
	public @ResponseBody List<Category> categoryList(Model model){
		
		List<Category> category = productService.findCategory();
		
		return category;
	}
	//获取商品类别
	@RequestMapping(value="/productList")
	public String productList(HttpServletRequest request,String cid,Model model){
		
		List<Product> productList = productService.findProductByCid(cid);
		model.addAttribute("productList", productList);
		
		List<Product> historyProductList = new ArrayList<Product>();
		
		//获得客户端携带名字叫pids的cookie
				Cookie[] cookies = request.getCookies();
				if(cookies!=null){
					for(Cookie cookie:cookies){
						if("pids".equals(cookie.getName())){
							String pids = cookie.getValue();//3-2-1
							String[] split = pids.split("-");
							for(String pid : split){
								Integer ipid=Integer.parseInt(pid);
								Product pro = productService.findProduct(ipid);
								historyProductList.add(pro);
							}
						}
					}
				}
		model.addAttribute("historyProductList", historyProductList);
		
		return "product_list";
	}
	
}
