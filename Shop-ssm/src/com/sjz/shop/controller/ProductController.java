package com.sjz.shop.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sjz.shop.pojo.Cart;
import com.sjz.shop.pojo.CartItem;
import com.sjz.shop.pojo.Product;
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
	public String product(Integer pid,Model model){
		Product product = productService.findProduct(pid);
		model.addAttribute("product", product);
		
		return "product_info";
	}
	
	@RequestMapping(value="/addProductToCart")
	public String addProductToCart(Integer pid,Integer buyNum,HttpServletRequest request,Model model){
		HttpSession session = request.getSession();
		
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
	}
	
	
	
	
}
