package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.si.cab.car.Car;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		Car c = ap.getBean(Car.class);
		c.PrintData();
	}
}