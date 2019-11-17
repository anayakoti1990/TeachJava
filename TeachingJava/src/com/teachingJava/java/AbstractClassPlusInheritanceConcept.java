package com.teachingJava.java;

 abstract class AbstractClassPlusInheritanceConcept {
	
	public String s1="Anudeep";

}
 class AnotherClass extends AbstractClassPlusInheritanceConcept{
	
	public  void method1() {
		System.out.println("This message sits inside the Inherited Class");
		System.out.println("My name is:"+s1);// Inheriting the properties
	}
	
	
}

 
 
