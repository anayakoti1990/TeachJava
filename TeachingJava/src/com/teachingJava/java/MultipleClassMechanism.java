package com.teachingJava.java;
// In this program we are declaring attributes and methods.
//In the other class we are creating Objects and reusing all the stuff in this Class in other Class
public class MultipleClassMechanism {

 public static  String firstName="Anudeep";
 public static final String lastName = "Nayakoti";
 
 
 //Since the attributes are Private, the only way to access them is by method
 public static void getfirstName() {
	 
	String gettingFirstName=firstName;
	System.out.println(gettingFirstName);
	
 }

 public static void changeFirstname() {
	String fname=firstName;
	fname="Ankith";
	System.out.println(fname+lastName);
	
	 
 }
 public static void method1() {
	 System.out.println(lastName);
	   
   
 }
	
	
}
