package com.joelgtsantos.dijenction.services;

/**
 * @author Joel Santos
 *
 * dinjection
 * 2018
 */
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
