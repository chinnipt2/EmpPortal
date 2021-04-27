package com.my.actions;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String message;
	
	public String execute()
	{
		System.out.println("From execute method");
		return  "SUCCESS";		
	}
	
	public String add()  throws Exception
	{
		System.out.println("From add method");
		return  "SUCCESS";			
	}
	
	public String update()
	{
		System.out.println("From update method");
		return  "SUCCESS";			
	}
	
	public String delete()
	{
		System.out.println("From delete method");
		return  "SUCCESS";			
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}