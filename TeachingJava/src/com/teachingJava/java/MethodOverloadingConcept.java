package com.teachingJava.java;
//lets try the method overloading concept
public class MethodOverloadingConcept {
    public static void main(String[] args) {
   //Calling the overloaded methods inside the Main
        method1("1", "anu");
        method1(3,4,5);
        method1("Anudeep", "Ankith", "Roshini",  "Sai", "SreeManish", "Shrusti", "Shresta");
    }

    //This is the method1
    public static void method1(String s1, String s2)
    {
        System.out.println("These are the values inside the method:" +s1 + " " +s2);
    }
    //This the Method2
    public static void method1(int i1, int i2, int i3){
        System.out.println("The result of adding two values of integers inside a method is:" +(i1+i2+i3));
    }
   //Another method3 with unlimited number of arguments using three dot operator;
    public static void method1(String ... sInfinity){
        System.out.println(sInfinity);

    }



}
