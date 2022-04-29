package com.dto;

import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx= 
				new GenericXmlApplicationContext("classpath:stu.xml");
		Student stu= ctx.getBean("firstStudent", Student.class);
		System.out.println(stu.getCats());

	}

}
