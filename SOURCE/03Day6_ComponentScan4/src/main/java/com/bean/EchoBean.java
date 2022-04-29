package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.OneService;
import com.service.TwoService;
@Service
public class EchoBean {
	@Autowired
	OneService one;
	@Autowired
	TwoService two;
	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OneService getOne() {
		return one;
	}
	public void setOne(OneService one) {
		this.one = one;
	}
	public TwoService getTwo() {
		return two;
	}
	public void setTwo(TwoService two) {
		this.two = two;
	}
	
	
}
