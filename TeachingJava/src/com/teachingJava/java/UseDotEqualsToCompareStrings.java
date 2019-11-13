package com.teachingJava.java;

public class UseDotEqualsToCompareStrings {
    public static void main(String[] args) {
        String s1 = "anu";
        String s2 = "deep";
        String fullname = s1 + s2;
        String totalname = "anudeep";
        if(fullname==totalname){
            System.out.println("They match");
        }else{
            System.out.println("They don't match");
        } //They are not matching because they are different objects
       if(fullname.equals(totalname))
       {
           System.out.println("They do Match using equals");
       }else{
           System.out.println("They don't match");
       }

    }
}
