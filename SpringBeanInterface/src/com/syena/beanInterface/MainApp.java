package com.syena.beanInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
		obj1.getMsg1();
		obj1.getMsg2();
		
		HelloIndia obj2 =(HelloIndia) context.getBean("helloIndia");
		obj2.getMsg1();
		obj2.getMsg2();
		obj2.getMsg3();

	}

}
