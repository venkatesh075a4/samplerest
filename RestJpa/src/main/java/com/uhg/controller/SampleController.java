package com.uhg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uhg.entity.Employee;
import com.uhg.service.SampleService;

@RestController
@RequestMapping("/v1")
public class SampleController {
	
	@Autowired
	SampleService service;
	
	@ResponseBody
	@RequestMapping(value="/hello", method=RequestMethod.POST, produces="application/json", consumes="application/json")
	public Employee hello(){
		return service.sayHello();
	}

}
