package beans;

public class Bus {
	private  Engine engine;
	
	public Bus(Engine engine) {
		this.engine=engine;
	}
	public void printData() {
		System.out.println("Bus Engine Model Year : " +engine.getModelYear());
	}
}