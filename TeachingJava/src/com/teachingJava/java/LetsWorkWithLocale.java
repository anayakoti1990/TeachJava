/*
** @anu
* In this program, we will use Locale
 */
package com.teachingJava.java;

import java.text.NumberFormat;
import java.util.Locale;

public class LetsWorkWithLocale {
    public static void main(String[] args) {
        double amount=10_345_986.45;// This will be soon converted into a Nice format using Number Formatter.
        //Using Locale, we can give our own Currency and the format as well
        Locale locality=new Locale("german","GERMANY");
        NumberFormat numF=NumberFormat.getNumberInstance(locality);
        System.out.println("The converted value is:" +numF.format(amount));
        NumberFormat curf=NumberFormat.getCurrencyInstance(locality);
        System.out.println(curf.format(amount));



    }
}
