package com.syena.beanInterface;

public class HelloWorld {
	
	private String msg1;
	private String msg2;
	
	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}
	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}
	
	public void getMsg1() {
		System.out.println("World msg1 : "+msg1);
	}
	public void getMsg2() {
		System.out.println("World msg2 : "+msg2);
	}

}
