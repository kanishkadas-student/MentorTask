package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.model.User;
import com.cognizant.validator.LoginValidator;

@Controller
public class LoginController {
	@Autowired
	private LoginValidator loginValidator;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(loginValidator);
	}
	
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String showLoginPage(@ModelAttribute("user") User user) {
		return "login";
	}
	
	@RequestMapping(value="/submitlogin", method= RequestMethod.POST)
	public String successfullLogin(@ModelAttribute("user") @Validated User user,BindingResult result) {
		if(result.hasErrors()) {
			return "login";
		}
		return "welcome";
	}
}
