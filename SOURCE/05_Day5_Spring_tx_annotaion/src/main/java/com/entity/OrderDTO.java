package com.entity;

public class OrderDTO {

	int num;
	  String pcode;
	  int quantity;
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDTO(int num, String pcode, int qnantity) {
		super();
		this.num = num;
		this.pcode = pcode;
		this.quantity = qnantity;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int qnantity) {
		this.quantity = qnantity;
	}
	@Override
	public String toString() {
		return "OrderDTO [num=" + num + ", pcode=" + pcode + ", quantity=" + quantity + "]";
	}

	  
}
