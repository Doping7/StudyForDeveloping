package com.spring;

public class Dog {
	String DogName;
	int DogAge;
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String dogName, int dogAge) {
		super();
		DogName = dogName;
		DogAge = dogAge;
	}
	@Override
	public String toString() {
		return "Dog [DogName=" + DogName + ", DogAge=" + DogAge + "]";
	}
	public String getDogName() {
		return DogName;
	}
	public void setDogName(String dogName) {
		DogName = dogName;
	}
	public int getDogAge() {
		return DogAge;
	}
	public void setDogAge(int dogAge) {
		DogAge = dogAge;
	}

	
}
