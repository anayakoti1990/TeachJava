package com.teachingJava.java;

public class NewStuff {
    public static void main(String[] args) {
        //Trying Instance operator

        String s1="Saritha";
        if (s1 instanceof String){
            System.out.println("Instance operator worked here");
        }


        //Trying Terinary operator
        int anudeep=1202;

        String a= 1202==(anudeep)? "It is Anudeep's rollNumber":"Do not know whose rollNumber it is";
        System.out.println("Explored the ternary operator in Java:\n"+a);




    }


}
