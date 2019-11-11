package com.teachingJava.java;

public class DefaultBooleans {
    static boolean mydef;
    public static void main(String[] args) {
        System.out.println("The default boolean value when not Declared is: "+mydef);//It returns False.
        String dummy="True";
        boolean convertBooleanValue=Boolean.parseBoolean(dummy);// Using Boolean Class we are converting string value to Boolean
        System.out.println("Converted Boolean Value is: "+convertBooleanValue);

    }
}
