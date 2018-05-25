package com.joelgtsantos.dijenction.services;

import org.springframework.stereotype.Service;

/**
 * @author Joel Santos
 *
 * dinjection
 * 2018
 */
@Service
public class SetterGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - I was injected by the getter";
	}

}
