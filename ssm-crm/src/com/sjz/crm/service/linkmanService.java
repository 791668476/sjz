package com.sjz.crm.service;

import java.util.List;

import com.sjz.crm.pojo.LinkMan;

public interface linkmanService {
	void addLinkman(LinkMan linkman);
	List<LinkMan> listLinkman();
	void deleteLinkman(Integer lkm_id);
}
