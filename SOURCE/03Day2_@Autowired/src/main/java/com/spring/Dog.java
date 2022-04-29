package com.spring;

public class Dog {

	String dogName;

	@Override
	public String toString() {
		return "Dog [dogName=" + dogName + "]";
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public Dog(String dogName) {
		super();
		this.dogName = dogName;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
}
