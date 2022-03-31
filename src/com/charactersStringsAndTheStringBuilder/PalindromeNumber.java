package com.charactersStringsAndTheStringBuilder;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x,number,y=0,temp=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number: ");
        number=input.nextInt();
        x=number;
        while (number>0){
            x=number%10;
            number=number/10;
            temp=temp*10+x;
        }
        if (temp==y){
            System.out.println("Number is palindrome");
        }else
            System.out.println("Number is not palindrome");
    }
}
