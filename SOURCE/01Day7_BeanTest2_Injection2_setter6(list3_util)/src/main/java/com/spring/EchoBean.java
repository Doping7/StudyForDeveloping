package com.spring;

import java.util.List;

public class EchoBean {
	List<AnotherBean> valueList;
	AnotherBean anotherBean;

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EchoBean(List<AnotherBean> valueList, AnotherBean anotherBean) {
		super();
		this.valueList = valueList;
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

	public void setValueList(List<AnotherBean> valueList) {
		this.valueList = valueList;
	}

	public String sayEcho() {
		return "hello";
	}

	public List<AnotherBean> getValueList() {
		return valueList;
	}

	@Override
	public String toString() {
		return "EchoBean [valueList=" + valueList + ", anotherBean=" + anotherBean + "]";
	}

}
