package com.simran.employeemanagementsystem;

import com.simran.employeemanagementsystem.entity.Employee;
import com.simran.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Override // run method executes when we run Springboot Appln
	public void run(String... args) throws Exception {
/*
		Employee employee1=new Employee("Sijo","Joshi","sim.j@gmail.com");
		employeeRepository.save(employee1);

		Employee employee2=new Employee("Shin","Deb","s22@gmail.com");
		employeeRepository.save(employee2);

		Employee employee3=new Employee("Birbal","Ak","BirbalAk@gmail.com");
		employeeRepository.save(employee3);
*/
	}
}
