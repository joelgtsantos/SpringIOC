package com.joelgtsantos.dijenction.services;

/**
 * @author Joel Santos
 *
 * dinjection
 * 2018
 */
public class PrimaryGreetingService implements GreetingService {
	
	private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

	@Override
	public String sayGreeting() {
		return this.greetingRepository.getEnglishGreeting();
	}

}
