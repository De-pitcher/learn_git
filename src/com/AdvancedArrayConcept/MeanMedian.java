package com.AdvancedArrayConcept;

import java.util.Scanner;

public class MeanMedian {
    public static void main(String[] args) {
        int[] fiveInt=new int[5];
        double mean, meanIn=0;
        int num;
        int median;
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter integer up to five");
        num=input.nextInt();
        fiveInt[count]=num;
        while (count<4){
            System.out.println("Enter another integer >>");
            num=input.nextInt();
            fiveInt[count]=num;
            count++;
        }
        for (int i : fiveInt) {
            meanIn += i;
        }
        mean=meanIn/5;
        median=fiveInt[3];
        System.out.println("The mean of the integers is" +
                " "+mean+" and the median is "+median);
    }
}
