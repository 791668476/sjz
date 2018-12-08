package com.sjz.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjz.crm.mapper.linkmanDao;
import com.sjz.crm.pojo.LinkMan;

@Service
public class linkmanServiceImpl implements linkmanService{

	@Autowired
	linkmanDao linkmandao;
	
	@Override
	public void addLinkman(LinkMan linkman) {
		linkmandao.addLinkman(linkman);
		
	}

	@Override
	public List<LinkMan> listLinkman() {
		List<LinkMan> listLinkman = linkmandao.listLinkman();
		return listLinkman;
	}

	@Override
	public void deleteLinkman(Integer lkm_id) {
		linkmandao.deleteLinkman(lkm_id);
		
	}

}
