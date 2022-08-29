package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
