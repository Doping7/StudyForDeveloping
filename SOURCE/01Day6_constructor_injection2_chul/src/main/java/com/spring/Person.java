package com.spring;

public class Person {

	String name ;

	//기본 생성자 x 
	
	public Person(String x) {
		super();
		System.out.println("person 생성자 호출 " + x);
	}	
	public Person() {
		super();
		System.out.println("person 기본생성자 호출");
	}
	public Person(String x, String y) {
		super();
		System.out.println("person 생성자 호출 " + x +"\t"+  y);
	}
	public Person(String xx, int yy) {
		super();
		System.out.println("person 생성자 호출 " + xx +"\t"+ yy);
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
