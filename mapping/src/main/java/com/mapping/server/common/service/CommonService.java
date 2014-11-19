package com.mapping.server.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.server.common.model.TestObject;
import com.mapping.server.common.repository.CommonRepository;

@Service
public class CommonService {

	@Autowired
	CommonRepository commonRepository;
	
	public TestObject testService(){
		return commonRepository.testRepository();
	}

}
