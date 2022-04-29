package com.spring;

import org.springframework.beans.factory.annotation.Required;

public class Person {

	String username;
	int age;	
	Cat cat;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Cat getCat() {
		return cat;
	}
@Required //set함수 위에 선언 하면 되고, 반드시 주입받아야한다는 의미로 사용
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public Person(String username, int age, Cat cat) {
		super();
		this.username = username;
		this.age = age;
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", cat=" + cat + "]";
	}

	
}
