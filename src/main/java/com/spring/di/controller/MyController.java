package com.spring.di.controller;

import org.springframework.stereotype.Controller;

import com.spring.di.service.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
