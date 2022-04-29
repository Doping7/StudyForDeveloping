package com.spring;

public class Person {

	String username;
	int age;
	Cat cat;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String username, int age, Cat cat) {
		super();
		System.out.println("생성자 호출"+ username +"\t" + age);
		this.username = username;
		this.age = age;
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", cat=" + cat + "]";
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

	
}
