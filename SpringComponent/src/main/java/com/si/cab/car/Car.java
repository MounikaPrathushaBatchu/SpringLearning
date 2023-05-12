package com.si.cab.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.si.cab.engine.Engine;

@Component
public class Car {
	
	@Autowired
	private Engine engine;
	
	public void PrintData() {
		System.out.println("Engine name : "+engine.getEngineName());
	}
}