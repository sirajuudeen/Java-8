package com.emp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.emp.app.model.employees;

public interface empRepository extends JpaRepository<employees, Integer>{

}
