package com.cicd.jenkins.GitDockerDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public String userData() {
		
		return "user name is suraj kore";
	}

}
