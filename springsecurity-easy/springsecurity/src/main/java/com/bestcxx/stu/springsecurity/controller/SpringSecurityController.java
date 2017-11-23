package com.bestcxx.stu.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class SpringSecurityController{
	
	@PostMapping("/login")
	public String login(){
		System.out.println("进来了");
		return "index";
	}

}
