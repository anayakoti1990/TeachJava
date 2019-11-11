/*
** @Anu
* Using Big decimal to understand the precision
 */
package com.teachingJava.java;

import java.math.BigDecimal;

public class UsingbIGClass {
    public static void main(String[] args) {
        double apple=0.12;
        System.out.println(apple*apple*apple);
        //Result is different
        //This precision is important especially when your working with currencies.
        String strValue=Double.toString(apple);
        BigDecimal bigValue=new BigDecimal(strValue);
        BigDecimal bsum=bigValue.add(bigValue).add(bigValue);
        System.out.println(bsum);

    }

}
