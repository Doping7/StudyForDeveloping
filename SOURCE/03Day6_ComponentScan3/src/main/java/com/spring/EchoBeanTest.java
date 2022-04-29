package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.bean.EchoBean;
import com.service.OneService;
import com.service.TwoService;

public class EchoBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean service = (EchoBean)ctx.getBean("echoBean");
		
		OneService one = service.getOne();
		TwoService two = service.getTwo();
		one.one();
		two.two();
	}

}
