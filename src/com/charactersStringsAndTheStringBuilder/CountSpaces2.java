package com.charactersStringsAndTheStringBuilder;

import java.util.Scanner;

public class CountSpaces2 {
    public static void main(String[] args) {
        String str;
        Scanner input=new Scanner(System.in);
        System.out.println("Write a sentence >>");
        str=input.nextLine();
        System.out.println(str);
        int x=0;
        int y=0;
        while(x<str.length()){
            if (str.charAt(x)==' ') {
                ++y;
            }++x;
        }
        System.out.println("The total number of space in the " +
                "sentence you typed is "+y);
    }
}
