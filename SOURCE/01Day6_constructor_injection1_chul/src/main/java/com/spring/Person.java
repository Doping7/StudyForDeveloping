package com.spring;

public class Person {

	String name ;

	//기본 생성자 x 
	
	public Person(String x) {
		super();
		this.name = x;
		System.out.println("person 생성자 호출 " + x);
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getInfo() {
		return "홍길동";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
