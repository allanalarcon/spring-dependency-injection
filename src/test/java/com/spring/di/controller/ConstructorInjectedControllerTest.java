package com.spring.di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring.di.service.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());	
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}
}
