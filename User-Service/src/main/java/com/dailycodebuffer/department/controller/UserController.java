package com.dailycodebuffer.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.department.entity.User_;
import com.dailycodebuffer.department.service.UserService;
import com.dailycodebuffer.department.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User_ saveDepatment(@RequestBody User_ department) {
		 log.info("inside saveDepartment method of controller");
		return userService.saveUser(department);
	}
	
	@GetMapping("/{userId}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("userId") Long userId) {
		log.info("inside findDepartmentById method of controller");
    return userService.getUserWithDepartment(userId);
		
	}
}
