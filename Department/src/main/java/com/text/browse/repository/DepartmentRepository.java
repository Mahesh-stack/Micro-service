package com.text.browse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.text.browse.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
