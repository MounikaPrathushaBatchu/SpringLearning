package com.si.cab.engine;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String engineName;

	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	

}
