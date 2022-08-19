package com.genspark.demo.service;

import com.genspark.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceConcrete implements EmployeeService{
    @Autowired
    private com.genspark.demo.dao.EmployeeDao EmployeeDao;

    @Override
    public List<Employee> getAllEmployees() {
        return EmployeeDao.findAll();
    }

    @Override
    public Employee getEmployeeById(int EmployeeId) {
        Optional<Employee> c = this.EmployeeDao.findById(EmployeeId);
        Employee Employee = null;
        if(c.isPresent()){
            Employee = c.get();
        }else {
            throw new RuntimeException("Employee not found for id :: " + EmployeeId);
        }
        return Employee;
    }

    @Override
    public Employee addEmployee(Employee Employee) {
        return this.EmployeeDao.save(Employee);
    }

    @Override
    public Employee updateEmployee(Employee Employee) {
        return this.EmployeeDao.save(Employee);
    }

    @Override
    public String deleteEmployeeById(int EmployeeId) {
        this.EmployeeDao.deleteById(EmployeeId);
        return "Employee " + EmployeeId + " has been deleted";
    }
}
