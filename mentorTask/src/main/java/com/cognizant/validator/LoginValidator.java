package com.cognizant.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cognizant.model.User;

@Component
public class LoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		boolean upper = true, lower = true, special = true, numeric = true;

		ValidationUtils.rejectIfEmpty(errors, "userName","", "User Name cannot be blank");
		ValidationUtils.rejectIfEmpty(errors, "password","", "Password cannot be blank");

	}

}
