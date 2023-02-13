package com.text.browse.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.text.browse.entity.Department;
import com.text.browse.services.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService depService;

	@GetMapping("/findDepartment/{id}")
	private Optional<Department> findByDepartmentId(@PathVariable("id") int id) {
		return depService.findByDepartmentId(id);
	}

	@PostMapping("/saveDepartment")
	private Department saveDepartment(@RequestBody Department department) {
		return depService.saveDepartment(department);
	}

}
