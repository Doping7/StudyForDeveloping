package com.dto;

public class LoginDTO {

	String name;
	String passwd;

	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public LoginDTO(String name, String passwd) {
		super();
		this.name = name;
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "LoginDTO [name=" + name + ", passwd=" + passwd + "]";
	}


}
