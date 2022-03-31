package com.decisionMaking;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int number;
        int a=0;
        int even=a+2;
        int odd=a+1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number >>");
        number=input.nextInt();
        if(number%2==odd)
            System.out.println("The number is an odd number");
        else if(number%2==even||number==2)
            System.out.println("The number is an even number");
        else if(number==0||number<0)
            System.out.println("The number is invalid");
    }
}
