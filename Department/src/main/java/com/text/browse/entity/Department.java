package com.text.browse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String departmentName;
	private String departmentCode;
	private String departmentAdd;

	public Department() {
		super();
	}

	public Department(int id, String departmentName, String departmentCode, String departmentAdd) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentCode = departmentCode;
		this.departmentAdd = departmentAdd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentAdd() {
		return departmentAdd;
	}

	public void setDepartmentAdd(String departmentAdd) {
		this.departmentAdd = departmentAdd;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", departmentCode=" + departmentCode
				+ ", departmentAdd=" + departmentAdd + "]";
	}

}
