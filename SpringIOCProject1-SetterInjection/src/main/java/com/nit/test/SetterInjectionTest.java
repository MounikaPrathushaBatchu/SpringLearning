package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import com.nit.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
//		FileSystemResource res = new FileSystemResource("C:\Users\Admin\workspace\IOCProject1-SetterInjection\src\main\java\com\nit\cfgs\applicatopnContext.xml");
		FileSystemResource res = new FileSystemResource("src/main/java/applicatopnContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Object object = factory.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator)object;
		String msg = generator.generateMessage("ABC");
		System.out.println("Wish Message is : " +msg);
		
//		ApplicationContext ap = new ClassPathXmlApplicationContext();
//		WishMessageGenerator generator = (WishMessageGenerator)ap.getBean("generator");
//		generator.generateMessage("ABC");
	}
}