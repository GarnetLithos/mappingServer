package com.mapping.server.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mapping.server.common.service.CommonService;
import com.mapping.server.main.model.User;


@Controller
@RequestMapping(value = "/testGetUser")
public class CommonController {
	
	@Autowired
	CommonService commonService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public User testGet(){
		return commonService.testGetUser();
	}
}
