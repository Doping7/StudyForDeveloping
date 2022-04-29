package com.dto;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{


	private String name;
	private int age;
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean.distory=======");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet=======");
		
	}
	
	
	public void getInfo() {
		System.out.println("getInfo()==================");
	}
	   //init-method: 초기화작업
		public void aaa() {
			System.out.println("init-method.aaa");
		}
	    //destroy-method: 자원 반납
		public void bbb() {
			System.out.println("destroy-method.bbb");
		}
	public Student() {
	System.out.println("기본 생성자 호출");
	}
	
	
 
}
