package com.spring;

import java.util.List;

public class EchoBean {
	List valueList;

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
		return "EchoBean [valueList=" + valueList + "]";
	}

	
}
