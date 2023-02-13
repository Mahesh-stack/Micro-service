package com.text.browse.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.text.browse.entity.Department;
import com.text.browse.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository depRepository;

	public Optional<Department> findByDepartmentId(int id) {
		return depRepository.findById(id);
	}

	public Department saveDepartment(Department department) {
		return depRepository.save(department);
	}

}
