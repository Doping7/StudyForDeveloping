package com.spring;

public class AnotherBean {
	String name;
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AnotherBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnotherBean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "AnotherBean [name=" + name + ", age=" + age + "]";
	}

	public void getInfo() {
		System.out.println("AnotherBean getInfo() 호출");
	}
}
