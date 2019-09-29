package com.springsecurity.auth;

import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationError implements ErrorController {

	private final static String ERROR_PATH = "/error";
	private ErrorAttributes errorAttributes;
	
	 public void AppErrorController(ErrorAttributes errorAttributes) {
	        this.errorAttributes = errorAttributes;
	 }
	
	@GetMapping(ERROR_PATH)
	public String error() {
		return "<h1>Error Page. Something unexpected happened.</h1>";
	}
	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}

}
