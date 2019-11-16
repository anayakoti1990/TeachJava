/*
** @Anu
* In this Program I will be teaching you different kinds of loops in Java
 */

package com.teachingJava.java;

import java.util.Arrays;

public class VariousLoops {

    public static void main(String[] args) {
        //Array one
        String[] months={"Jan", "Feb", "March", "April", "May", "June",
                "July", "August", "September", "October",
                "November", "December"};
        //Arraytwo
        int[] evenNumbersFrombelowZero={2,4,6,8,10};
        char[] rupal={'R', 'U', 'P', 'A', 'L'};

        //Trying Foreach Array
        for (char jain:
            rupal ) {
            System.out.println(jain);// Its better with chars  for each.
        }
        for (String dummy:
             months) {
            //System.out.println(months); These are in flexible;
        } // Using foreach loop it prints the object referencing only but not the value.

        //Trying for loop
        for(int i=0; i<months.length;i++){
            System.out.println(months[i]);
        }
        //Trying for loop to print the even numbers in reverse fashion

        for(int i=4; i>=0;i--){
            System.out.println(evenNumbersFrombelowZero[i]);

        }
        //Trying while Loop
        int counter=0;
        while(counter<rupal.length){
            System.out.println(rupal[counter]);
            counter++;
        }
        //The difference between For and While is that we are declaring the
        // iterator outside the loop and are incrementing inside the loop
        //Lets try the do-while loop
        int counter1=0;
        do{
            System.out.println(rupal[counter1]);
            counter1++;
        }while(counter1<rupal.length);

        //******************Tried all kinds of loops, Java has offered us********************//



    }
}
