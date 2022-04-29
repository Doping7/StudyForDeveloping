package com.dto;

public class Cat {

	private String catName;
	private int catAge;
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String catName, int catAge) {
		super();
		this.catName = catName;
		this.catAge = catAge;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public int getCatAge() {
		return catAge;
	}
	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
	@Override
	public String toString() {
		return "Cat [catName=" + catName + ", catAge=" + catAge + "]";
	}

	
}
