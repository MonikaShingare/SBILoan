package com.jbk.springbootFrontend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jbk.springbootFrontend.entity.Employee;
import com.jbk.springbootFrontend.service.Employee_Impl;
import com.jbk.springbootFrontend.service.Employee_i;
@CrossOrigin
@RestController
@RequestMapping(value="/employee")
public class Employee_Controller {
	Employee_i service=new Employee_Impl();
	
    @GetMapping("/show-employee")
	public ResponseEntity<List<Employee>> showEmployee()
	{
		
		
		List<Employee> list =service.showEmployee();
		if(!list.isEmpty())
		{
			return new ResponseEntity<List<Employee>>(list, HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<List<Employee>>( HttpStatus.NOT_FOUND);
		}
		
		
		
	}
	

}
