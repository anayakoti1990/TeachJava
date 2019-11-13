package com.teachingJava.java;
import javafx.util.converter.LocalDateTimeStringConverter;

import java.text.DateFormat;
import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDates {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();//Java8 new feature for Dates.
        System.out.println(dt);//It displays the Unix style Date Lets format it
        //Lets use another Class
        LocalDate trr = LocalDate.of(1990, 9, 5);
        System.out.println(trr);
        LocalDate ippudu=LocalDate.now();
        DateTimeFormatter andaminaDate=DateTimeFormatter.ofPattern("M/yyyy/d");
        System.out.println(andaminaDate.format(ippudu));

        DateTimeFormatter frr=DateTimeFormatter.ofPattern("M/yyyy/d");
        System.out.println(frr.format(trr));


    }
}
