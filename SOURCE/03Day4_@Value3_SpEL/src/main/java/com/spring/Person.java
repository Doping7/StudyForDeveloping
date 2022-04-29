package com.spring;

import org.springframework.beans.factory.annotation.Value;

public class Person {
@Value("#{yyy.username}")
	String username;
@Value("#{yyy.age}")//int 타입이어도 문자열로 입력해야함.
	int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String username, int age) {
		super();
		this.username = username;
		this.age = age;
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
	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + "]";
	}
	
}
