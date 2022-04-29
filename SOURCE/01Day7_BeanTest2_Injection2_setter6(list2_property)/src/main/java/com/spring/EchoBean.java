package com.spring;

import java.util.List;

public class EchoBean {
	List valueList;
	AnotherBean anotherBean;

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}
	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
	public EchoBean(List valueList, AnotherBean anotherBean) {
		super();
		this.valueList = valueList;
		this.anotherBean = anotherBean;
	}
	public String sayEcho() {
		return "hello";
	}
	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EchoBean(List valueList) {
		super();
		this.valueList = valueList;
	}

	public List getValueList() {
		return valueList;
	}

	public void setValueList(List valueList) {
		this.valueList = valueList;
	}

	@Override
	public String toString() {
		return "EchoBean [valueList=" + valueList + ", anotherBean=" + anotherBean + "]";
	}

	
}
