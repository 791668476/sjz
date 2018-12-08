package com.sjz.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjz.crm.pojo.LinkMan;
import com.sjz.crm.service.linkmanService;

@Controller
public class linkmanController {
	
	@Autowired
	linkmanService linkmanservice;
	
	@RequestMapping("/addLinkman.action")
	public String AddLinkmanAction(LinkMan linkman){
		linkmanservice.addLinkman(linkman);
		
		return "/jsp/linkman/add";
	}
	@RequestMapping("/listLinkman.action")
	public String AddLinkmanAction(Model model){
		List<LinkMan> list = linkmanservice.listLinkman();
		model.addAttribute("list", list);
		return "/jsp/linkman/list";
	}
	@RequestMapping("/deleteLinkman.action")
	public String deleteLinkmanAction(Integer lkm_id){
		linkmanservice.deleteLinkman(lkm_id);
		return "redirect:listLinkman.action";
	}
}
