package com.joelgtsantos.dijenction.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Joel Santos
 *
 * dinjection
 * 2018
 */
@Service
@Primary
@Profile("en")
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - Primary greeting service";
	}

}
