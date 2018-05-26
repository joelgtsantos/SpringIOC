/**
 * 
 */
package com.joelgtsantos.dijenction.services;

import org.springframework.stereotype.Service;

/**
 * @author Joel Santos
 *
 * dinjection
 * 2018
 */
@Service
public class GreetingRepositoryImpl implements GreetingRepository {

	/* 
	 * @see com.joelgtsantos.dijenction.services.GreetingRepository#getEnglishGreeting()
	 */
	@Override
	public String getEnglishGreeting() {
		return "Hello - Primary Greeting service";
	}

	/* 
	 * @see com.joelgtsantos.dijenction.services.GreetingRepository#getSpanishGreeting()
	 */
	@Override
	public String getSpanishGreeting() {
		return "Hola - Servicio de saludo primario";
	}

	/* 
	 * @see com.joelgtsantos.dijenction.services.GreetingRepository#getGermanGreeting()
	 */
	@Override
	public String getGermanGreeting() {
		return "Halo - Primär bedienung gruß";
	}

}
