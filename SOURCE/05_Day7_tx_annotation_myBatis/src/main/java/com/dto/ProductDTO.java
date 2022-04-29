package com.dto;

public class ProductDTO {

	String pcode;
	String pname;
	int price;
	int quantity;
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(String pcode, String pname, int price, int quantity) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductDTO [pcode=" + pcode + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity + "]";
	}

	
}
