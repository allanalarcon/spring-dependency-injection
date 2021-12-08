package com.spring.di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String sayHello() {
		System.out.println("#### Controller");
		return "Hello World";
	}
}
