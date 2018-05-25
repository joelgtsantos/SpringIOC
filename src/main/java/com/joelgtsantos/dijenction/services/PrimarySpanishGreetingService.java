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
@Profile("es")
public class PrimarySpanishGreetingService implements GreetingService {
	
	private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
	
	@Override
	public String sayGreeting() {
		return this.greetingRepository.getSpanishGreeting();
	}

}
