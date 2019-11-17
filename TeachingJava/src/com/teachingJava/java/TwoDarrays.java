package com.teachingJava.java;

import java.util.Arrays;

public class TwoDarrays
{
    public static void main(String[] args) {
        String states[][]=new String[4][3];
        states[0][0]="Michigan";

        states[0][1]="Lansing";

        states[1][0]="Utah";
        states[1][1]="SaltLake";

        states[2][0]="Wyoming";
        states [2][1]="Cheyenne";
        states[3][0]="Colarado";
        states[3][1]="Denver";
      for(int i=0; i<4;i++)
      {
         StringBuilder S3=new StringBuilder();
         S3.append(states[i][0]).append (":").append(states[i][1]);
          System.out.println(S3);
        }

    }

}
