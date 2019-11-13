package com.teachingJava;

import java.util.Scanner;

public class WorkingwithSwitch {
    public static void main(String[] args) {
        //In Java prior to Java7, Strings cannot be used inside Switch statement
        System.out.println("This Application will provide you the capital of the Southern States of India");
        System.out.println("Southern States Include: Telangana (TS), TamilNadu (TN), Kerala (KL), Karnataka (KA), AndhraPradesh (AP)");
        Scanner console=new Scanner(System.in);
        System.out.println("Please enter the State Code:");
        String userInput=console.next();
        //Lets begin the Switch Statement
        switch (userInput){

            case "TS":
                System.out.println("The capital for Telangana is: Hyderabad");
                break;
            case "TN":
                System.out.println("The capital for Tamil Nadu is: Chennai");
                break;
            case "KL":
                System.out.println("The capital for Kerala is: Thiruvananthapuram");
                break;
            case "KA":
                System.out.println("The capital for Karnataka is Bangalore");
                break;
            case "AP":
                System.out.println("The capital for Andhra Pradesh is Amaravathi");
                break;
            default:
                System.out.println("You have entered Capital that is not part of South-India");


        }
    }


}
