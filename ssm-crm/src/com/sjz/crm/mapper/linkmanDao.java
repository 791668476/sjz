package com.sjz.crm.mapper;

import java.util.List;

import com.sjz.crm.pojo.LinkMan;

public interface linkmanDao {
	void addLinkman(LinkMan linkman);
	List<LinkMan> listLinkman();
	void deleteLinkman(Integer lkm_id);
}
