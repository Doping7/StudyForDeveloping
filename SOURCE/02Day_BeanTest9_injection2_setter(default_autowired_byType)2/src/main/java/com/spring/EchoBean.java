package com.spring;

import java.util.List;

public class EchoBean {
	private List valueList;
	private AnotherBean anotherBean;
	@Override
	public String toString() {
		return "EchoBean [valueList=" + valueList + ", anotherBean=" + anotherBean + "]";
	}
	public List getValueList() {
		return valueList;
	}
	public void setValueList(List valueList) {
		this.valueList = valueList;
	}
	public AnotherBean getAnotherBean() {
		return anotherBean;
	}
	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
	public EchoBean(AnotherBean anotherBean) {
		super();
		this.anotherBean = anotherBean;
	}
	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}
