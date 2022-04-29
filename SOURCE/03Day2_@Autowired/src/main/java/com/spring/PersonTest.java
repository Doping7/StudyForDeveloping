package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		Person p = (Person)ctx.getBean("onePerson");
		System.out.println(p.getCat().getCatName() + "\t"+ p.getCat().getCatAge());
		System.out.println(p.getDog());
	}

}
