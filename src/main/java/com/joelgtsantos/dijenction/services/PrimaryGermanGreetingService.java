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
@Profile({"de", "default"})
@Primary
public class PrimaryGermanGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Halo - Primär bedienung gruß";
	}

}
