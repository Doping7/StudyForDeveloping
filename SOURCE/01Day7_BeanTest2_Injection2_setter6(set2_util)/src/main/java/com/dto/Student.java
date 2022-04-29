package com.dto;

import java.util.Set;

public class Student {
	String name;
	int age;
	Set<Cat> cats;
	public Set<Cat> getCats() {
		return cats;
	}
	public void setCats(Set<Cat> cats) {
		this.cats = cats;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, Set<Cat> cats) {
		super();
		this.name = name;
		this.age = age;
		this.cats = cats;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", cats=" + cats + "]";
	}
	

}
