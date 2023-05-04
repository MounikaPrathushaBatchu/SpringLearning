package com.nit.test;

public class Test {
	private int a;
	private int b;
	
	public Test() {
		System.out.println("zero param constructor");
	}
	public Test(int a, int b) {
		System.out.println("two param constructor");
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
}
