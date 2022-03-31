package com.fullstackdemo.employee.service;

import java.util.List;

import com.fullstackdemo.employee.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> getAllEmployees();

	boolean deletEmployee(Long id);

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Long id, Employee employee);

	
}
