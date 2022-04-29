package com.dto;

public class Cat {

	private String catName;
	private int catAge;

	//setter injection
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}



	@Override
	public String toString() {
		return "Cat [catName=" + catName + ", catAge=" + catAge + "]";
	}
	public String getCatInfo() {
		return catName+"\t"+catAge;
	}
	
}
