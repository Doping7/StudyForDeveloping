package com.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student{


	private String name;
	private int age;	
	
	public void getInfo() {
		System.out.println("getInfo()==================");
	}
	   //init-method: 초기화작업
		@PostConstruct
		public void aaa() {
			System.out.println("init-method.aaa");
		}
	    //destroy-method: 자원 반납
		@PreDestroy
		public void bbb() {
			System.out.println("destroy-method.bbb");
		}
	public Student() {
	System.out.println("기본 생성자 호출");
	}
	
	
 
}
