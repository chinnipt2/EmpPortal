package com.my.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonalInfo {
	
	private String name;
	private List<String> location; // list box
	private String summary; //text area
	private List<String> hobbies;//checkbox
	private List<String> genders;
	private static final String MALE = "MALE";
	private static final String FEMALE = "FEMALE";
	private Date dateOfBirth= new Date();
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public PersonalInfo(){
		genders = new ArrayList<String>();
		genders.add(MALE);
		genders.add(FEMALE);
		
		location = new ArrayList<String>();
		location.add("India");
		location.add("USA");
		
		hobbies = new ArrayList<String>();
		hobbies.add("Music");
		hobbies.add("reading");
		
		
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getLocation() {
		return location;
	}
	public void setLocation(List<String> location) {
		this.location = location;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public List<String> getGenders() {
		return genders;
	}
	public void setGenders(List<String> genders) {
		this.genders = genders;
	}
	public String getDefaultGenderValue(){
		System.out.println("getDefaultGenderValue");
		return MALE;
	}
	
}
