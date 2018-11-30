package com.employee.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.employee.bean.Employee;
import com.employee.service.EmployeeService;

@Controller
@SessionAttributes("name")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private Employee employee;
	
	@RequestMapping(value = "/Employee-list", method = RequestMethod.GET)
	public String showEmployee(ModelMap map) {

		String nameofuser=(String) map.get("name");
		map.put("Employees",employeeService.getAllEmployee());
		map.put("name", nameofuser);
		return "Employee-list";

	}
	
	@RequestMapping(value = "/add-Employee", method = RequestMethod.GET)
	public String showAddEmployee(ModelMap map) {
		return "Employee";

	}
	@RequestMapping(value = "/add-Employee", method = RequestMethod.POST)
	public String addOrUpdateEmployee(ModelMap map,@RequestParam String role) {
		System.out.println("hiiiiiiiiiiiiiiiiiiii");
		employee.setIdEmployee(employee.getIdEmployee()+1);
		employee.setFirstName("vicky");
		employee.setLastName("Bellale");
		employee.setRole(role);
		employee.setJoiningDAte(new Date());
		employee.setSalary(80000);
		employee.setEmail("vk@gmail.com");
		
		employeeService.addEmployee(employee);
		
		return "redirect:/Employee-list";

	}
}