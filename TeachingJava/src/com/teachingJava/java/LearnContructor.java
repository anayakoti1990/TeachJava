package com.teachingJava.java;
//In this Program we will learn constructor 

/* Rules of Constructor:
 * Constructor name + Class Name + File Name must be same
 * Constructor method should never be Void. It must of Return type always
 */
public class LearnContructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnContructor object1=new LearnContructor();
   
	}
	
	//Lets create a constructor
	public LearnContructor() {
		System.out.println("This message is inside the Contructor. I think this will be called as soon as the Object is created");
	}

}
