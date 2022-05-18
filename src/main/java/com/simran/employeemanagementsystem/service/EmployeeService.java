package com.simran.employeemanagementsystem.service;

import java.util.List;

import com.simran.employeemanagementsystem.entity.Employee;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(int id);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(int id);
}
