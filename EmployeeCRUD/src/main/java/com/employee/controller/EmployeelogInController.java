package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class EmployeelogInController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {

		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model, @RequestParam String nameofuser) {
		model.put("name", nameofuser);
		return "welcome";
	}

	
	
}
