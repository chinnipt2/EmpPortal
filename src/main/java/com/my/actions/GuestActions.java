package com.my.actions;

public class GuestActions {
	private String contactDetails;
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	public GuestActions(){
		System.out.println("GuestActions..Constructor created");
	}
	public String contactUs(){
		System.out.println(contactDetails);
		contactDetails ="Please contact us on 123456";
		return "success";
	}
	public String aboutUs(){
		return "success";
	}
	public String login(){
		return "success";
	}
}
