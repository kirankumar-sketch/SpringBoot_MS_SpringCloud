package com.dailycodebuffer.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dailycodebuffer.department.entity.User_;
import com.dailycodebuffer.department.repository.UserRepository;
import com.dailycodebuffer.department.vo.Department;
import com.dailycodebuffer.department.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RestTemplate restTempalte;

	public User_ saveUser(User_ department) {
		log.info("inside saveDepartment method of service");
		return userRepo.save(department);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		ResponseTemplateVO responseTemplateVO=new ResponseTemplateVO();
		log.info("inside getUserWithDepartment method of userservice");
		User_ user=userRepo.findByUserId(userId);
		responseTemplateVO.setUser(user);
		
		Department department=restTempalte.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);
		responseTemplateVO.setDeparment(department);
		return responseTemplateVO;
	}
}
