package com.springsecurity.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/")
	public String welcome() {
		return "<h1>Welcome! to Spring Security Session.</h1>";
	}
}
