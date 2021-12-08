package com.spring.di.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.di.service.GreetingService;

@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;

	//@Autowired is not required
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
