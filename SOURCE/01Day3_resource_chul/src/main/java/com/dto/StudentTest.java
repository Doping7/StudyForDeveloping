package com.dto;

import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:stu.xml");
		
		Student stu = (Student)ctx.getBean("xxx");
		stu.setName("홍길동");
		stu.setAge(20);
		
		String name = stu.getName();
		int age = stu.getAge();
		System.out.println(name +"\t"+ age);
		
	}

}
