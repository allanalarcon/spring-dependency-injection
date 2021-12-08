package com.spring.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.di.service.GreetingService;

@Controller
public class PropertyInjectedController {

	@Qualifier("propertyGreetingService")
	@Autowired
	public GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}