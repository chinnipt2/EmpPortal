package com.my.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.my.beans.PersonalInfo;
import com.opensymphony.xwork2.ActionSupport;

public class PersonalInfoActions extends ActionSupport{
	private PersonalInfo personalInfo;
	public PersonalInfoActions(){
		personalInfo = new PersonalInfo();
		System.out.println("PersonalInfoActions Created");
	}
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}
	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
	public String newData(){
		System.out.println("hello");
		return "success";
	}
	public String editData(){
		return "success";
	}
	public String delteData(){
		return "success";
	}
	public String downloadFile() throws Exception{
		File img = new File("/path/to/image/image.jpg");
		InputStream  stream = new FileInputStream(img);

		return "success";
	}
}
