package com.spring;

public class Cat {
	String catName;
	int catAge;
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String catName, int catAge) {
		super();
		this.catName = catName;
		this.catAge = catAge;
	}
	@Override
	public String toString() {
		return "Cat [catName=" + catName + ", catAge=" + catAge + "]";
	}

	
}
