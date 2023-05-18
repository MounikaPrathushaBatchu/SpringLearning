package com.syena.practice;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		context.registerShutdownHook();
		
//		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
//		obj1.setMessage("object one reference");
//		obj1.getMessage();
//		
//		HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
//		obj2.getMessage();
		

	}
	
}
