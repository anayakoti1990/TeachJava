package com.teachingJava.java;
//In this program we will be referencing both Call by value and Call by references
public class CopyAndReference {
    public static void main(String[] args) {
        String s1="Apple";
        String s2="Orange";
        String s3="Berries";
        method1(s1);// We are passing the copy of the s1 value to method1
        System.out.println(s1);// The original value remains the same though because Strings are immutable.
        int[] i1={1,6,8,10};
     method2(i1);// The value has changed because it pointed the reference.
        System.out.println(i1[3]); //The original value also changed.

    }

    public static void method1(String s1){
        s1=s1+"Hello";
        System.out.println(s1);
    }
    //Lets create another method.
    public static void method2(int[] i1){
        i1[3]++;// we have incremented the value of i3
        System.out.println(i1[3]);
    }


}
