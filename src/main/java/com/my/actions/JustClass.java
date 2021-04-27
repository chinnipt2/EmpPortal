package com.my.actions;

public class JustClass {
	public static int count;
	public JustClass(){
		System.out.println("Instantiagted : "+ ++count);
	}
	public String noramlMethod() throws Exception{
		System.out.println("I am normal method invoked by struts");
		throw new Exception();
	}
}
