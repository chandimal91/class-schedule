package com.hr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
	
	@RequestMapping("/login")
	public String Login(){
		System.out.println("hiiiiiiii");
		return "User Exist";
	}

}
