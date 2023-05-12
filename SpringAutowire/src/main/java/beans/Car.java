package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
//	private String carName;
	
	@Qualifier("e1")
	@Autowired
	private Engine engine;
	
//	public void setCarName(String carName) {
//		this.carName = carName;
//	}
	public void printCarData() {
//		System.out.println("Car Name : " +carName);
		System.out.println("Model Year : " +engine.getModelYear());
	}

}
