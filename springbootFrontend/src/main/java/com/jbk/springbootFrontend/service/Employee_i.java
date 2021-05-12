package com.jbk.springbootFrontend.service;

import java.util.List;

import com.jbk.springbootFrontend.entity.Employee;

public interface Employee_i {
	public String saveEmployee(Employee employee);

	public List<Employee> showEmployee();
	
}
