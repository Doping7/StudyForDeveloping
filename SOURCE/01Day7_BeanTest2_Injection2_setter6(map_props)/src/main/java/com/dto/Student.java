package com.dto;

import java.util.Map;
import java.util.Properties;

public class Student {

	String name;
	int age;
	Map<String, Cat> mapCat;
	Properties phones;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, Map<String, Cat> mapCat, Properties phones) {
		super();
		this.name = name;
		this.age = age;
		this.mapCat = mapCat;
		this.phones = phones;
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
	public Map<String, Cat> getMapCat() {
		return mapCat;
	}
	public void setMapCat(Map<String, Cat> mapCat) {
		this.mapCat = mapCat;
	}
	public Properties getPhones() {
		return phones;
	}
	public void setPhones(Properties phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mapCat=" + mapCat + ", phones=" + phones + "]";
	}

}
