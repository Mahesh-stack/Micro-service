package com.text.browse.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.text.browse.entity.Department;
import com.text.browse.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	private static Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	private DepartmentRepository depRepository;

	public Optional<Department> findByDepartmentId(int id) {
		return depRepository.findById(id);
	}

	public Department saveDepartment(Department department) {
		return depRepository.save(department);
	}

}
