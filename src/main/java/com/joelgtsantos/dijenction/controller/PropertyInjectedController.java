package com.joelgtsantos.dijenction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joelgtsantos.dijenction.services.GreetingServiceImpl;

/**
 * @author Joel Santos
 *
 * dinjection
 * 2018
 */
@Component
public class PropertyInjectedController {
	
	//@Qualifier("GreetingServiceImpl")
	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
