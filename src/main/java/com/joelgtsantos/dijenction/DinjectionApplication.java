package com.joelgtsantos.dijenction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.joelgtsantos.dijenction.controller.ConstructorInjectedController;
import com.joelgtsantos.dijenction.controller.MyController;
import com.joelgtsantos.dijenction.controller.PropertyInjectedController;
import com.joelgtsantos.dijenction.controller.SetterInjectedController;
import com.joelgtsantos.dijenction.examplebeans.FakeDataSource;


/**
 * @author Joel Santos
 *
 * dinjection
 * 2018
 */
@SpringBootApplication
public class DinjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DinjectionApplication.class, args);
		
		MyController myController = (MyController)ctx.getBean("myController");
			
		System.out.println(myController.sayHello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
	}
}
