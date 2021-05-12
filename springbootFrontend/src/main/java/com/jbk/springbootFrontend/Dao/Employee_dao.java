package com.jbk.springbootFrontend.Dao;

import java.util.List;

import com.jbk.springbootFrontend.entity.Employee;

public interface Employee_dao {
	public String saveEmployee(Employee employee);

	public List<Employee> showEmployee();

}
