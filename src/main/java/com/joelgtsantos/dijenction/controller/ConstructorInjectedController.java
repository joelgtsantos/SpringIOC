package com.joelgtsantos.dijenction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.joelgtsantos.dijenction.services.GreetingService;

/**
 * @author Joel Santos
 *
 * dinjection
 * 2018
 */
@Component
public class ConstructorInjectedController {
	private GreetingService greetingService;
	
	@Autowired
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}	
}
