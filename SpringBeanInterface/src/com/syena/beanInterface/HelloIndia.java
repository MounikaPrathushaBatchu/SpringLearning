package com.syena.beanInterface;

public class HelloIndia {
	
	private String msg1;
	private String msg2;
	private String msg3;
	
	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}
	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}
	public void setMsg3(String msg3) {
		this.msg3 = msg3;
	}
	
	public void getMsg1() {
		System.out.println("India Msg1 : "+msg1);
	}
	public void getMsg2() {
		System.out.println("India Msg2 : "+msg2);
	}
	public void getMsg3() {
		System.out.println("India Msg3 : "+msg3);
	}

}
