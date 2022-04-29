package com.spring;

import org.springframework.beans.factory.annotation.Autowired;


public class Person {

	String username;
	int age;
	/* @Autowired */
	@Autowired(required = false)
	Cat cat;
	@Autowired
	Dog dog;
	
	
	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", cat=" + cat + ", dog=" + dog + "]";
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
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public Person(String username, int age, Cat cat, Dog dog) {
		super();
		this.username = username;
		this.age = age;
		this.cat = cat;
		this.dog = dog;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
}