package com.Array;

import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        final int NUM_STRINGS=20;
        String[] strings=new String[NUM_STRINGS];
        String[] strA=new String[NUM_STRINGS];
        String[] strB=new String[NUM_STRINGS];
        String inputStr;
        String disType;
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter strings up to 20 >>");
        inputStr=input.next();
        while (count<NUM_STRINGS){
            if (strings[count].equals(""))
                strings[count]=inputStr;
            if (inputStr.length()<=5)
                strA[count]=inputStr;
            else
                strB[count]=inputStr;
            System.out.println("Enter another string >>");
            inputStr=input.next();
            count++;
        }
        System.out.println("Select the type of string" +
                "to display");
        System.out.println("a. for shot string and " +
                "b. for longer string");
        disType=input.next();
        for (int x = 0; x<strA.length; ++x) {
            if (disType.charAt(0) == 'a')
                System.out.println(strA[x]);
            else if (disType.charAt(0) == 'b')
                System.out.println(strB[x]);
            else
                System.out.println("Error!");
        }

    }
}
