package com.emp.app.service;

import java.util.List;

import com.emp.app.model.employees;


public interface empService {
	public List<employees> getAllEmployee();
	public employees getEmployeeById(int id);
	public employees saveOrUpdate(employees emps);
	public employees update(employees emps, int empid);
	public void delete(int empid);
	
}
