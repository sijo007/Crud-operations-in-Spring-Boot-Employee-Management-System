package com.simran.employeemanagementsystem.controller;


import com.simran.employeemanagementsystem.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simran.employeemanagementsystem.service.EmployeeService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller //to handle the requests
public class EmployeeController {

	@Autowired
    private EmployeeService employeeService;

    /*public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }*/


    //create a handler method to handle list employees and return model and view
    @GetMapping("/employees")
    public String listEmployees(Model model){
        model.addAttribute("employees",employeeService.getAllEmployees());
        return "index"; //returning view
    }


    @GetMapping("/employees/new")
    public String createEmployeeForm(Model model){
        Employee employee=new Employee();
        model.addAttribute("employee",employee);
        return "create_employee";
    }

    @PostMapping("/employees")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/employees";

    }

    @GetMapping("/employees/edit/{id}")
    public String editEmployeeForm(@PathVariable int id, Model model){
            model.addAttribute("employee",employeeService.getEmployeeById(id));
            return "edit_employee";
    }
    @PostMapping("/employees/{id}")
    public String updateEmployee(@PathVariable  int id, @ModelAttribute("employee") Employee employee,
                                 Model model)
    {
        //get employee from database with id

        Employee employee1= employeeService.getEmployeeById(id);
        employee1.setId(id);
        employee1.setFirstName(employee.getFirstName());
        employee1.setLastName(employee.getLastName());
        employee1.setEmail(employee.getEmail());

        employeeService.updateEmployee(employee1);
        return "redirect:/employees";

    }
    @GetMapping("/employees/delete/{id}")
    public String deleteEmployee(@PathVariable int id, @ModelAttribute("employee") Employee employee,
                                 Model model)
    {
        employeeService.deleteEmployee(id);
        return "redirect:/employees";
    }
}
