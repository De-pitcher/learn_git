package com.Array;

import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        final int NUM_VALUES=10;
        double[] values=new double[NUM_VALUES];
        double valuesEntered;
        final int QUIT=99999;
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any value >>");
        valuesEntered=input.nextDouble();
        while (count<NUM_VALUES&&valuesEntered!=QUIT){
            if (valuesEntered!=QUIT){
                values[count]=valuesEntered;
                System.out.println("Enter another values or "+QUIT
                +" to quit");
                valuesEntered=input.nextDouble();
            }
            count++;
        }
        if (valuesEntered==QUIT&&values[0]==0.0){
            System.out.println("Error!");
        }else {
            for (int x=0;x<count;++x)
            System.out.println("The value entered is " +
                    +values[x]);
        }
    }
}

