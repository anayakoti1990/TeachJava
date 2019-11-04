package Emailapp;

import java.util.Arrays;

public class RandomString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String stuff="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=";
	//created a new array
	char[] password= new char[9];
	//setPassword();
	
	
	
	
	
	
	
	 public String kannam() {
		 for(int i=0;i<9;i++)
		 {
		 //In this loop we are writing logic to generate random
			int rand= (int) (Math.random()*stuff.length());
			
			
			password[i]=stuff.charAt(rand);
			
		 
		}
	
	
	
	
	}		
	}	
	
}
