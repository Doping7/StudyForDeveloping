package com.dto;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{

	private String name;
	private int age;
	public Student() {
		super();
		System.out.println("기본생성자 호출");
	}

	public void getInfo() {
		System.out.println("getInfo()");
	}
	
	public void aaa() {// init-method:초기화작업, xml에 등록하여 init함수로 사용
		System.out.println("init-method.aaa");
	}
	public void bbb() {// destroy-method:마무리작업, xml에 등록하여 init함수로 사용
		System.out.println("destroy-method.bbb");
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DispossibleBean.distroy=======");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet=======");
		
	}
	
}
