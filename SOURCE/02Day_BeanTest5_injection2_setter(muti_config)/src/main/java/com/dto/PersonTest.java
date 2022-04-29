package com.dto;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml","classpath:echo2.xml");
		Person p = (Person)ctx.getBean("onePerson");
		System.out.println(p);
	}

}
