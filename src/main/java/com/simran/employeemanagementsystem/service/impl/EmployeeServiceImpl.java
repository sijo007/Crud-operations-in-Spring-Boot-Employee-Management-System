package com.simran.employeemanagementsystem.service.impl;

import com.simran.employeemanagementsystem.entity.Employee;
import com.simran.employeemanagementsystem.repository.EmployeeRepository;
import com.simran.employeemanagementsystem.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    //if only one constructor avoid @Autowired
	@Autowired
    private EmployeeRepository employeeRepository;

    /*public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
*/
    @Override
     //@ModelAttribute("employees")
    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
       return employeeRepository.findById(id).get();

    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public void deleteEmployee(int id){
         employeeRepository.deleteById(id);
    }
}
