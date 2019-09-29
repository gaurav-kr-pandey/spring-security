package com.springsecurity.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/")
	public String welcome() {
		return "<h1>Welcome! to Spring Security Session.</h1>";
	}
	
	@GetMapping("/settings")
	public String settings() {
		return "<h1>Settings</h1>";
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "<h1>Profile</h1>";
	}
}
