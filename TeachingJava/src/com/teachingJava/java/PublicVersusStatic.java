package com.teachingJava.java;

public class PublicVersusStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	staticMethod();
	//I am unable to call publicMethod. I have to create an object to Call publicMethod
	
	//Lets instantiate an Object
	PublicVersusStatic obj1=new PublicVersusStatic();
	obj1.publicMethod();

	}

	public void publicMethod() {
		System.out.println("This message sits under publicMethod");
	}
	public static void  staticMethod() {
		System.out.println("This message sits under staticMethod");
	}
	
	
	
	
	
}
