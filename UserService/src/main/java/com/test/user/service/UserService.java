package com.test.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.user.entity.User;
import com.test.user.exception.UserNotFoundException;
import com.test.user.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	private static Logger LOGGER = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private UserRepository userRepository;

	public User saveNewUser(User user) throws UserNotFoundException {
		User userExistOrNot = userRepository.findByUserId(user.getId());
		if (userExistOrNot != null) {
			throw new UserNotFoundException("User Exists");
		} else {
			userExistOrNot = userRepository.save(user);
		}
		return userExistOrNot;
	}
}
