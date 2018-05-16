package com.uhg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uhg.dao.EmployeeRepository;
import com.uhg.entity.Employee;

@Service
public class SampleService {
	
	@Autowired
	EmployeeRepository repositiry;

	public Employee sayHello(){
		return repositiry.findById(1);
	}
}
