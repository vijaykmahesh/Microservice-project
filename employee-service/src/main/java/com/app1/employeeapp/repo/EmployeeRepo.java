package com.app1.employeeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app1.employeeapp.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
