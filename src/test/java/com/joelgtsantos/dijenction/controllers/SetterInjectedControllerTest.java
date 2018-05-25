package com.joelgtsantos.dijenction.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.joelgtsantos.dijenction.controller.SetterInjectedController;
import com.joelgtsantos.dijenction.services.GreetingServiceImpl;

/**
 * @author Joel Santos
 *
 * dinjection
 * 2018
 */
public class SetterInjectedControllerTest {
	
	private SetterInjectedController setterInjectedController;
	
	@Before
	public void setUp() throws Exception {
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
	}
}
