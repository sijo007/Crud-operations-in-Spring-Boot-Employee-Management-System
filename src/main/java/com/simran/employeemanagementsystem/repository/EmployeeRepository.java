package com.simran.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simran.employeemanagementsystem.entity.Employee;

//we don't need to annotate it with Repo because JPArepo has default implementation class simpleJpaRepo which is already annotated with repo
//in JPArepo all methods by default provides @transactional so we dont have to provide that in service layer

public interface EmployeeRepository extends JpaRepository <Employee,Integer> {
}
