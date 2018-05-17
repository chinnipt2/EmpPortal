package com.my.actions;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AdminMenuAction extends ActionSupport{
	public String execute(){
		System.out.println("AdminMenuAction -execute");
		return "success";
	}
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		System.out.println("AdminMenuAction -validate");
	}
	public String populate() {
		// TODO Auto-generated method stub
		System.out.println("AdminMenuAction -Populate");
		return "populate";
	}
	
}
