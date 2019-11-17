package com.teachingJava.java;

public class ClassForInteractingWithOtherClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleClassMechanism obj1=new MultipleClassMechanism();
		MultipleClassMechanism obj2=new MultipleClassMechanism();
		MultipleClassMechanism obj3=new MultipleClassMechanism();
		MultipleClassMechanism obj4=new MultipleClassMechanism();
		obj4.firstName="Sai";//We are able to change the firstName because the attribute was public
		//Lets try our luck to change the lastName that is declared as Final
		//obj4.lastName="Pilli"; WE cannot change as it has a modifier called Final
		System.out.println(obj4.firstName);
		obj3.changeFirstname();
		obj2.getfirstName();
		
        obj1.method1();
	}

}
