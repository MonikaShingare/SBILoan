package com.jbk.springbootFrontend.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jbk.springbootFrontend.config.DBUtil;
import com.jbk.springbootFrontend.entity.Employee;

public class Employee_DaoImpl implements Employee_dao {
	 private Connection connection;

	@Override
	public String saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> showEmployee() {
		// TODO Auto-generated method stub
		connection=DBUtil.getConnection();
		List<Employee> list=new ArrayList<>();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM employee");
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next())
			{
			int employeeid=rs.getInt(1);
			String employeename=rs.getString(2);
			String status=rs.getString(3);
			String createddtm=rs.getString(4);
			String updateddtm=rs.getString(5);
			String phoneno=rs.getString(6);
			String country=rs.getString(7);
			Employee e=new Employee(employeeid, employeename, status, createddtm, updateddtm, phoneno, country);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


	
	
	
    

	
}
	
	
    

	
		
	
   


	

