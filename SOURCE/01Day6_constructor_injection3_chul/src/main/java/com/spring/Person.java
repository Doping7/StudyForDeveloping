package com.spring;

public class Person {
	String username;
	int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String username, int age) {
		super();
		this.username = username;
		this.age = age;
		System.out.println("생성자호출" + username +"\t" + age);
	}
	
	public String getInfo() {
		return "홍길동";
	}
	
	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + "]";
	}

}
