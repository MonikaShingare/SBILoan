package com.jbk.springbootFrontend.service;


import java.util.List;

import com.jbk.springbootFrontend.Dao.Employee_DaoImpl;
import com.jbk.springbootFrontend.Dao.Employee_dao;
import com.jbk.springbootFrontend.entity.Employee;

public class Employee_Impl implements Employee_i {
 Employee_dao dao=new Employee_DaoImpl();
 
	@Override
	public String saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> showEmployee() {
		List<Employee> list=dao.showEmployee();
		return list;
	}
	
	
}
