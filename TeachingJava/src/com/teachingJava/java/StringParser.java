package com.teachingJava.java;

public class StringParser {
    public static void main(String[] args) {
        String s3="Welcome to Pleasant Grove";
        int i1=s3.indexOf("Grove");
        System.out.println(i1);
        String subs=s3.substring(i1);//This must print Grove
        System.out.println(subs);
       String s9="to                Space";//lets trim the space and print
        System.out.println(s9.length());
        //Lets print the string that has no spaces.
         String s12=s9.trim();
        //System.out.println();


    }
}
