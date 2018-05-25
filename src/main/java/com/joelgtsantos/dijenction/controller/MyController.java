package com.joelgtsantos.dijenction.controller;

import org.springframework.stereotype.Component;

import com.joelgtsantos.dijenction.services.GreetingService;

/**
 * @author Joel Santos
 *
 * dinjection
 * 2018
 */
@Component
public class MyController {

private GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}	
}
