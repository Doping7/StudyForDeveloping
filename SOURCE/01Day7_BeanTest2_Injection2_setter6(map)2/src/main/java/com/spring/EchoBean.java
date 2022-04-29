package com.spring;

import java.util.Map;

public class EchoBean {
	Map<String, AnotherBean> map;
	AnotherBean anotherBean;

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EchoBean(Map<String, AnotherBean> map, AnotherBean anotherBean) {
		super();
		this.map = map;
		this.anotherBean = anotherBean;
	}

	public EchoBean(AnotherBean anotherBean) {
		super();
		this.anotherBean = anotherBean;
	}

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}

	public void setMap(Map<String, AnotherBean> map) {
		this.map = map;
	}

	public String sayEcho() {
		return "hello";
	}

	public Map<String, AnotherBean> getMap() {
		return map;
	}

	@Override
	public String toString() {
		return "EchoBean [map=" + map+ ", anotherBean=" + anotherBean + "]";
	}

}
