package com.joelgtsantos.dijenction.services;

/**
 * @author Joel Santos
 *
 * dinjection
 * 2018
 */
public class PrimaryGermanGreetingService implements GreetingService{

	private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
	    
	@Override
	public String sayGreeting() {
		return this.greetingRepository.getGermanGreeting();
	}

}
