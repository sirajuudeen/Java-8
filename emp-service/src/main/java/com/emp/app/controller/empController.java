package com.emp.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.app.model.employees;
import com.emp.app.service.empService;

@RestController
public class empController {
	
	@Autowired
	private empService empService;
 
	@Autowired
	private Environment env;
	
	@GetMapping("/emp")
	private List<employees> getAllBooks()   
	{  
		return empService.getAllEmployee();  
	}  
	
	@GetMapping("/emp/{empid}")  
	private employees getEmployee(@PathVariable("empid") int empid)   
	{  
		return empService.getEmployeeById(empid);  
	}  

	@PostMapping("/emp")
	private employees saveEmployee(@RequestBody employees emps) {
		return empService.saveOrUpdate(emps);
	}
	
	@PutMapping("/emp/{empid}") 
	private employees updateEmployee(@RequestBody employees emps, @PathVariable ("empid") int empid) {
		return empService.update(emps, empid);
	}
	
	@DeleteMapping("emp/{empid}")
	private void deleteEmployee(@PathVariable("empid") int empid) {
		 empService.delete(empid);
	}
	
}
