package com.test.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.test.user.entity.Department;
import com.test.user.entity.User;
import com.test.user.service.UserService;
import com.test.user.vo.RestTemplateVO;

@RestController
@RequestMapping("/user")
public class UserController {

	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/save-user")
	public User saveNewUser(@RequestBody User user) {
		User savedUser = userService.saveNewUser(user);
		return savedUser;
	}

	@GetMapping("/userAndDepartment/{id}")
	public RestTemplateVO userWithDepartment(@PathVariable int id) {
		RestTemplateVO vo = new RestTemplateVO();
		User user = userService.findUser(id);
		Department department = restTemplate
				.getForObject("http://localhost:8001/department/findDepartment/" + user.getId(), Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}

}
