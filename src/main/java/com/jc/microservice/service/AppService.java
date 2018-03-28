package com.jc.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jc.microservice.dao.AppDao;
@Service
public class AppService {
	@Autowired
	AppDao appDao;
	public void pull() {
		appDao.pull();
	}
	public String get(int key){
		return appDao.get(key);
	}
	public void put(int key, String value){
		appDao.put(key, value);
	}
}
