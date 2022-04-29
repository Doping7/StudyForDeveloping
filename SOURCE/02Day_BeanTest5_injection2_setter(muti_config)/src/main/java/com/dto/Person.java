package com.dto;

public class Person {
	private String usename;
	Cat cat;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String usename, Cat cat) {
		super();
		this.usename = usename;
		this.cat = cat;
	}
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "Person [usename=" + usename + ", cat=" + cat + "]";
	}

	
}
