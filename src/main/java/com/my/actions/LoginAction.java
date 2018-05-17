package com.my.actions;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.my.actions.beans.LoginBean;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author satiskak
 *
 */
@Controller
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class LoginAction extends ActionSupport{	
	private LoginBean loginBean;
	public LoginAction(){
		System.out.println("LoginAction created");
	}
	public String execute(){
		final HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println("I am here.");
		return "success";
		 
	}
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
		//System.out.println(loginBean.getUserName());
	}
	
}
