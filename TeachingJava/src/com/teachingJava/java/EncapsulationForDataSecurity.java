package com.teachingJava.java;

public class EncapsulationForDataSecurity {
	
private String fname="Anudeep";
private String lname="Nayakoti";



//Getter Method
public String getfname() {
	String firstName=this.fname;
	System.out.println(firstName);
	return firstName;
}
//Setter Method

public String setName()
{
	String lastName=this.lname;
	System.out.println(lastName);
	lastName="Dandu";
	System.out.println(lastName);
	return "hey";
}

}
