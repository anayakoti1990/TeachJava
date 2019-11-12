package com.teachingJava.java;

import com.sun.javafx.binding.StringFormatter;

import java.text.NumberFormat;

public class NewFormattorJava7IntroducedUnderscores {



    public static void main(String[] args) {
        String s1= "Anudeep";
        boolean b1=true;
        int i1=80;
        //System.out.println(i1);
         //Lets use Helper Classes to Convert
        String s2=Boolean.toString(b1);
        String s9="A_N_U_D";
        //System.out.println(s2);
        String s3=Integer.toString(i1);
        System.out.println(s3+s3+s3);//we are concatenating the converted Strings.
        long longestValue=10_000_000;//underscores are introduced as code seperators in Java7
        NumberFormat convertLongestValue=NumberFormat.getNumberInstance();
        String finalizedCoverted=convertLongestValue.format(longestValue); //Insted of .format, I used String and there was an Error
        //Long value cannot be converted to String
        System.out.println(finalizedCoverted);
        






    }
}
