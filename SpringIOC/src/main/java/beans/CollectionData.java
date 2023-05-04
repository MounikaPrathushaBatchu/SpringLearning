package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionData {
	
	private List<String> fruits;
	private Set<Integer> mobileNumbers;
	private Map<String,String> edata;
	
	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}
	public void setMobileNumbers(Set<Integer> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	public void setEdata(Map<String, String> edata) {
		this.edata = edata;
	}
	public void printCollectionData() {
		System.out.println("Fruits : " +fruits);
		System.out.println("Mobile Numbers : " +mobileNumbers);
		System.out.println("eno<-->ename");
		System.out.println("Employee number and name : "+edata);
	}
}