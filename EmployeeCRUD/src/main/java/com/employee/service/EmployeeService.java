package com.employee.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.bean.Employee;

@Service
public class EmployeeService {

	private static List<Employee> list = new ArrayList<Employee>();
	static{
		list.add(new Employee(10, "shubham", "Bellale", "sb@gmail.com", 500000, "java developer", new Date()));
		list.add(new Employee(11, "mahesh", "Bellale", "mb@gmail.com", 600000, "java developer", new Date()));
		list.add(new Employee(12, "sangam", "Bellale", "sb88@gmail.com", 400000, "java developer", new Date()));
		list.add(new Employee(13, "yogesh", "Bellale", "yb@gmail.com", 700000, "java developer", new Date()));

	}
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return list;
	}
	
	public void addEmployee(Employee e){
		list .add(e);
		
	}
}
