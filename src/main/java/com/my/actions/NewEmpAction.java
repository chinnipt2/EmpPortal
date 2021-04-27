package com.my.actions;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.my.beans.Emp;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
@Controller
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class NewEmpAction extends ActionSupport implements Preparable{
	
	private Emp emp;
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("execute " );
		return "page";
	}
	public String add() throws Exception{
		System.out.println("add");
		return "page";
	}
	public String edit() throws Exception{
		System.out.println("edit");
		return "page";
	}
	public String delete() throws Exception{
		System.out.println("delete");
		return "page";
	}
	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
