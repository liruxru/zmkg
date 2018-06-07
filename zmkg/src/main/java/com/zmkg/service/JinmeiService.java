package com.zmkg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zmkg.dao.JinmeiDAO;
import com.zmkg.entity.Jinmei;

@Service
public class JinmeiService {
	@Autowired
	private JinmeiDAO jinmeiDAO;
	public JinmeiDAO getJinmeiDAO() {
		return jinmeiDAO;
	}
	public void setJinmeiDAO(JinmeiDAO jinmeiDAO) {
		this.jinmeiDAO = jinmeiDAO;
	}
	
	@Transactional
	public List<Jinmei> listAll() {
		return jinmeiDAO.findAll();
	}

}
