package com.dailycodebuffer.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepo;

	public Department saveDepartment(Department department) {
		log.info("inside saveDepartment method of service");
		return departmentRepo.save(department);
	}
	
	public Department findDepartmentById(Long departmentId) {
		log.info("inside findDepartmentById method of service");
		return departmentRepo.findByDepartmentId(departmentId);
	}
}
