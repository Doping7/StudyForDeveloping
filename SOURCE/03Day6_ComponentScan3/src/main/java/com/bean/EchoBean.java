package com.bean;

import com.service.OneService;
import com.service.TwoService;

public class EchoBean {
	OneService one;
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
