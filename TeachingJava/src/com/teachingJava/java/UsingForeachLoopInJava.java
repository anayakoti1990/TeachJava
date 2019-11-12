package com.teachingJava.java;

public class UsingForeachLoopInJava {
    public static void main(String[] args) {
        char[] chars={'A', 'N', 'U', 'D','E','E','P'};
        //Lets convert the Chars to String
        String s1=new String(chars);
        System.out.println(s1);
        //Lets convert the above string to array of characters.
      char[] chars1=s1.toCharArray();
        System.out.println(chars1[0]);//testing if Converted or Not.
        //lets run the Foreach loop to print all the Characters inside an array:
        for (char c2:chars1)
        {
            System.out.println(c2);//This will print each of every character inside the array of chars1
        }
    }
}
