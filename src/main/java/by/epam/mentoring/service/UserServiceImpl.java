package by.epam.mentoring.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import by.epam.mentoring.dao.UserDao;
import by.epam.mentoring.entity.User;
import by.epam.mentoring.service.exception.UserLoginExeption;

@Component
public class UserServiceImpl implements UserService {
	private final static String PASSWORD_WRONG = "The password is wrong.";
	private final static String LOGIN_WRONG = "The login is wrong.";
	@Autowired
	private UserDao userDao;

	
	public User login(String login, String password) {
		User user = (User) userDao.findById(login);

		if (user != null) {
			if (password.equals(user.getPassword())) {
				return user;
			} else {
				throw new UserLoginExeption(PASSWORD_WRONG);
			}
		} else {
			throw new UserLoginExeption(LOGIN_WRONG);
		}
	}

	
	public boolean ValidateUserInfo(Map<String, Object> value) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean create(Map<String, Object> value) {
		// TODO Auto-generated method stub
		return false;
	}

}
