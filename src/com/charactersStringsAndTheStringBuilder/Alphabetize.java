package com.charactersStringsAndTheStringBuilder;

import java.util.Scanner;

public class Alphabetize {
    public static void main(String[] args) {
        String str;
        char aChar1,aChar2,aChar3;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three letters >>");
        str=input.next();
        while (str.length()!=3){
            System.out.println("Error!");
            System.out.println("Enter three letters >>");
            str=input.next();
        }
        aChar1=str.charAt(0);
        aChar2=str.charAt(1);
        aChar3=str.charAt(2);
        if (aChar1>aChar2&&aChar2>aChar3)
            System.out.println(aChar3+" "+aChar2+" "+aChar1);
        else if (aChar1>aChar2&&aChar3>aChar2)
            System.out.println(aChar2+" "+aChar3+" "+aChar1);
        else if (aChar3>aChar1&&aChar1>aChar2)
            System.out.println(aChar2+" "+aChar1+" "+aChar3);
        else if (aChar1<aChar2&&aChar2<aChar3)
            System.out.println(aChar1+" "+aChar2+" "+aChar3);
        else if (aChar1<aChar2&&aChar1>aChar3)
            System.out.println(aChar3+" "+aChar1+" "+aChar2);
        else
            System.out.println(aChar1+" "+aChar3+" "+aChar2);

    }
}
