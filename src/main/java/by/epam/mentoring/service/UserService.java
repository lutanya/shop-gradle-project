package by.epam.mentoring.service;

import java.util.Map;

import org.springframework.stereotype.Component;

import by.epam.mentoring.entity.User;

@Component
public interface UserService {

	User login(String login, String password);

	boolean ValidateUserInfo(Map<String, Object> value);

	boolean create(Map<String, Object> value);

}
