package com.joelgtsantos.dijenction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.joelgtsantos.dijenction.services.GreetingRepository;
import com.joelgtsantos.dijenction.services.GreetingService;
import com.joelgtsantos.dijenction.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {
	
	@Bean
	public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
		return new GreetingServiceFactory(greetingRepository);
	}
	
	@Bean
	@Primary
	@Profile({"default", "en"})
	public GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("en");
	}
	
	@Bean
	@Primary
	@Profile("es")
	public GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("es");
	}
	
	@Bean
	@Primary
	@Profile("de")
	public GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("de");
	}

}
