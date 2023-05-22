package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext ("spring.xml");
		Bank b = (Bank)ap.getBean("b");
		b.Diposite();
		b.WithDaraw();
		b.CalculateInterest();
	}
}