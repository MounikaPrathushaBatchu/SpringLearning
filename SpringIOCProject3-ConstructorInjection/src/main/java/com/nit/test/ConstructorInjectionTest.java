package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.nit.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		FileSystemResource res = new FileSystemResource("src/main/java/applicatopnContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Object object = factory.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator)object;
		String msg = generator.generateMessage("ABC");
		System.out.println("Wish Message is : " +msg);
	}
}