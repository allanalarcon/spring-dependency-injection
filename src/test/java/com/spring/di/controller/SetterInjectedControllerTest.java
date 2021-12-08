package com.spring.di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring.di.service.ConstructorGreetingService;

class SetterInjectedControllerTest {

	SetterInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}
}
