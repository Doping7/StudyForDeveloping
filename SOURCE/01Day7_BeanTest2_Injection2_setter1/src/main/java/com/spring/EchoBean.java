package com.spring;

public class EchoBean {

	String aaa;
	public String sayEcho() {
		return "hello";
	}
	public EchoBean() {
		super();
		System.out.println("기본생성자 호출");
		// TODO Auto-generated constructor stub
	}
	public String getAaa() {
		return aaa;
	}
	public void setMesg(String mesg) {
		System.out.println("setMesg(String mesg)");
		this.aaa = mesg;
	}
	
}
