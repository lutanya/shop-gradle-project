package by.epam.mentoring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import by.epam.mentoring.controller.constant.UserConstant;
import by.epam.mentoring.entity.User;
import by.epam.mentoring.service.UserService;
import by.epam.mentoring.service.exception.UserLoginExeption;

@RestController
@RequestMapping(path = "/usermanager")
public class UserManager {
	private static final String USER_LOGIN_ERROR = "Something goes wrong";

	private static final String USER_CREATE_ERROR = "Something goes wrong";

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET, value = "/login/{login}")
	public User loginUser(@PathVariable String login, String password) {
		
		try {
			User user = userService.login(login, password);
			return user;
		} catch (UserLoginExeption e) {
			
			throw new UserLoginExeption(e.getMessage());
		}
	}

	/*
	 * @RequestMapping(method=RequestMethod.POST, value="/create/{login}")
	 * public boolean createUser(@PathVariable String login,@RequestBody String
	 * password, String confirmPassword, String firstName, String lastName) {
	 * 
	 * Map<String, Object> value = new HashMap<>();
	 * value.put(UserConstant.LOGIN, login); value.put(UserConstant.PASSWORD,
	 * password); value.put(UserConstant.CONFIRM_PASSWORD, confirmPassword);
	 * value.put(UserConstant.FIRST_NAME, firstName);
	 * value.put(UserConstant.LAST_NAME, lastName);
	 * 
	 * if (userService.ValidateUserInfo(value)) {
	 * 
	 * return userService.create(value);
	 * 
	 * } else { return false; } }
	 */
}
