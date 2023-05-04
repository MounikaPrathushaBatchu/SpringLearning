package com.nit.test;

import java.lang.reflect.Constructor;

public class ReflectionAPI_Instantiation {

	public static void main(String[] args) {
		try {
			Class c = Class.forName(args[0]);
			
			Object obj1 = c.newInstance();
			System.out.println("obj1 : "+obj1.toString());
			System.out.println("---------------------------");
			Constructor cons[] = c.getDeclaredConstructors();
			Object obj2 = cons[0].newInstance();
			System.out.println("obj2 : "+obj2.toString());
			System.out.println("---------------------------");
			Object obj3 = cons[1].newInstance(10,20);
			System.out.println("obj3 : "+obj3.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
