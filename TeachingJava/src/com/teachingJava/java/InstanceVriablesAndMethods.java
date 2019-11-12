package com.teachingJava.java;

public class InstanceVriablesAndMethods {

    public  static String anu;//Instance variable

    public static void main(String[] args) {

        //Creating an object or instantiating a Class by itself
        InstanceVriablesAndMethods whatever = new InstanceVriablesAndMethods();//Constructor method
        InstanceVriablesAndMethods.anu = "Hello";
        InstanceVriablesAndMethods.displaySomething();//Instance Method
    }

    private static void displaySomething() {
        System.out.println(" "+anu);
    }


}




