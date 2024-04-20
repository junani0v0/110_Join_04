package com.join4.www.service;

import java.util.HashMap;

import com.join4.www.dao.JoinDao;

public class JoinService {
	
	public int join(HashMap<String, String> params) {
		System.out.println("-------------"+params);
		
		return joinDao.join(params);
	}
	
	
	private JoinDao joinDao;
	public void setJoinDao(JoinDao joinDao) {
		System.out.println("------------------"+joinDao+" in Service-----------");
		this.joinDao = joinDao;
	}

}
