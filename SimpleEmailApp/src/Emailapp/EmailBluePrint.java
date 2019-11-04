package Emailapp;

import java.util.Scanner;

public class EmailBluePrint {
private String firstName;
private String lastName;
private String password;
private String departmentName;
private String alternativeEmail;
private int capaciyOfEmail;


//Need a constructor to receive both FirstName and LastName

public EmailBluePrint(String fname, String lname) {
this.firstName=fname;
this.lastName=lname;

System.out.println("Constructed Email for: "+this.firstName+ "  " +this.lastName);

//As soon as the object is created, it prompts the user for the Department Name and stores.

this.departmentName=setDepartmentName();
System.out.println("Your Department is: "+this.departmentName);
this.password=setRandomPassword(9);
System.out.println(this.password);
	
}

//Ask for the departmentName
public String setDepartmentName() {
 
 System.out.println("Here are the Codes for the Department:\n12:IT\n13:DESIGN\n17:APPLICATION DEVELOPMENT\n Enter your Department code:");
 Scanner console=new Scanner(System.in);
 int deptInput=console.nextInt();
 if(deptInput==13) {return "Design";}
 else if (deptInput==12){ return "IT";}
 else if (deptInput==17) {return "Software developers";}
 else {return "You don't belong here";}
 
 
 
}


//Create a random string password



public String setRandomPassword(int length) {
	//From this collection of Characters, we will create random Password.
	String stuff="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()[]{}";
	char[] tassword=new char[9];
	for (int i=0; i<9; i++)
	{
	 
	 int rand= (int) ((Math.random())*stuff.length());
	 
	 tassword[i]=stuff.charAt(rand);
	}
	
	return new String(tassword);
	
}


//set alternative email




//set mailbox capacity

//Change the Password.



}

