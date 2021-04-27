package com.my.actions;

import com.my.beans.UserBean;
import com.opensymphony.xwork2.ActionSupport;

public class MyActionForm extends ActionSupport{
	private UserBean userBean;
	public UserBean getUserBean() {
		return userBean;
	}
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	public String execute(){
		System.out.println("I am normal pojo with execute method return type is void ");
		System.out.println("name :"+userBean.getName());
		
		return null;
	}
	public String page(){
		return "page";
	}
}
