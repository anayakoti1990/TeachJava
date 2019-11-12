package com.teachingJava.java;

public class ChartoString {

    public static void main(String[] args) {
        //Create an array of Char and Assign it to String
        char[] chars={'A', 'N', 'U', 'D', 'E', 'E','P'};
        System.out.println(chars[0]); //Testing Purpose

        String s1=new String(chars);// Assigned the chars array to String
        System.out.println(s1);// It conversted the list of items inside an Chars array into a String


    }
}
