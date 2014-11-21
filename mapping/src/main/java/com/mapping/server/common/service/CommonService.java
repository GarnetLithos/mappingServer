package com.mapping.server.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.server.common.repository.CommonRepository;
import com.mapping.server.main.model.User;

@Service
public class CommonService {

	@Autowired
	CommonRepository commonRepository;
	
	public User testGetUser(){
		return commonRepository.testRepository();
	}

}
