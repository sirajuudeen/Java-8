package com.emp.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.app.model.employees;
import com.emp.app.repository.empRepository;

@Service
public class empServiceImpl implements empService{

	@Autowired
	empRepository empRepository;
	
	@Override
	public List<employees> getAllEmployee() {
		return (List<employees>) empRepository.findAll();
	}
	@Override
	public employees getEmployeeById(int id) {
		return empRepository.findById(id).get();
	}
	@Override
	public employees saveOrUpdate(employees emps) {
		return empRepository.save(emps);
	}
	
	@Override
	public employees update(employees emps, int empid) {
		return empRepository.save(emps);
	}
	
	@Override
	public void delete(int empid) {
		empRepository.deleteById(empid);
		
	}
}
