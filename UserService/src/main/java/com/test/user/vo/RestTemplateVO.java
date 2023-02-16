package com.test.user.vo;

import com.test.user.entity.Department;
import com.test.user.entity.User;

public class RestTemplateVO {

	private User user;
	private Department department;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
