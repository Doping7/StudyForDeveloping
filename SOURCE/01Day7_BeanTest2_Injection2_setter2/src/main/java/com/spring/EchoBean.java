package com.spring;

public class EchoBean {

	AnotherBean xxx;
	
	public String sayEcho() {
		return "hello";
	}

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnotherBean getXxx() {
		return xxx;
	}

	public void setXxx(AnotherBean xxx) {
		this.xxx = xxx;
	}
	
}
