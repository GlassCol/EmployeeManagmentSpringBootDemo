package com.genspark.demo.service;

import com.genspark.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int EmployeeId);
    Employee addEmployee(Employee Employee);
    Employee updateEmployee(Employee Employee);
    String deleteEmployeeById(int EmployeeId);
}
