package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
public class DemoController {

	@GetMapping("/getDemo")
	public String getDemo() {
		return "Welcome to SB Programming";
	}
}
