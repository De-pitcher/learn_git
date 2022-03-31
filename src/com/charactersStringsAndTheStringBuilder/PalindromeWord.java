package com.charactersStringsAndTheStringBuilder;

import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        String x;
        StringBuilder y= new StringBuilder();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string you want to check:");
        x=input.nextLine();
        int length=x.length();
        for (int i=length-1;i>=0;i--){
            y.append(x.charAt(i));
        }
        if (x.equalsIgnoreCase(y.toString())){
            System.out.println("The string is palindrome");
        }else
            System.out.println("The string is not palindrome");
    }
}
