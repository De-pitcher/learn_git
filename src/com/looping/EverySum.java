package com.looping;

public class EverySum {
    public static void main(String[] args) {
        int n;
        int sum=1;
        final int LIMIT=50;
        System.out.println("The sum of numbers from 1-50 is >>");
        System.out.println("1");
        for(n=1;n<LIMIT;n++){
            ++n;
            sum=sum+n;
            System.out.println(sum);

         }
    }
}
