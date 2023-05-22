package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;
import beans.Truck;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("-----------car-----------");
		Car c = (Car)ap.getBean("c");
		System.out.println(c.getClass().getCanonicalName());
		System.out.println("car engine : "+c.myCarEngine().getName());
		
		System.out.println("-----------bus-----------");
		Bus b = (Bus)ap.getBean("b");
		System.out.println(b.getClass().getCanonicalName());
		System.out.println("bus engine : "+b.myBusEngine().getName());
		
		System.out.println("-----------truck-----------");
		Truck t = (Truck)ap.getBean("t");
		System.out.println(t.getClass().getCanonicalName());
		System.out.println("bus engine : "+t.myTruckEngine().getName());
		
	}
}