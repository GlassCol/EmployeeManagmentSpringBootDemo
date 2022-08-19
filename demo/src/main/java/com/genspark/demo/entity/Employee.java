package com.genspark.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_employees")
public class Employee {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;
    private String employeeName;
    private String employeeTitle;

    private int employeeSalary;

    private int careerLength;

    public Employee() {
    }

    public Employee(String employeeName, String employeeTitle, int employeeSalary, int careerLength) {
        this.employeeName = employeeName;
        this.employeeTitle = employeeTitle;
        this.employeeSalary = employeeSalary;
        this.careerLength = careerLength;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getCareerLength() {
        return careerLength;
    }

    public void setCareerLength(int careerLength) {
        this.careerLength = careerLength;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
