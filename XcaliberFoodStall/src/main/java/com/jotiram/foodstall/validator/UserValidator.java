package com.jotiram.foodstall.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.jotiram.foodstall.model.User;
import com.jotiram.foodstall.service.UserService;

@Component
public class UserValidator implements Validator {

	@Autowired
	private UserService userService;

	@Override
	public boolean supports(Class<?> clazz) {
		
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		User user = (User) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
		if(user.getUserName().length() < 6 || user.getUserName().length() > 32) {
			errors.rejectValue("username", "Size.useForm.username");
		}

		if(userService.findByUsername(user.getUserName()) !=null)
		{
			errors.rejectValue("username", "Diplicate.userForm.username");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		if(user.getPassword().length() < 8 || user.getPassword().length() > 32)
		{
			errors.rejectValue("password", "Size.userForm.password");
		}
		
		if(!user.getConfirmPassword().equals(user.getPassword()))
		{
			errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
		}
	}
	
}
