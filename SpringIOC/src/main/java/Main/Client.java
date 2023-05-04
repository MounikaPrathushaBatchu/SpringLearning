package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;
import beans.CollectionData;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("car.xml","engine.xml");
		Car c = (Car)ap.getBean("c");
		c.printCarData();
		
//		ApplicationContext ap1 = new ClassPathXmlApplicationContext("collectionData.xml");
//		CollectionData cd = (CollectionData)ap1.getBean("cd");
//		cd.printCollectionData();

	}
}
