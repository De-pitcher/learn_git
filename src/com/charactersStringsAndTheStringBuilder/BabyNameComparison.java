package com.charactersStringsAndTheStringBuilder;

import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        String firstName,secondName,thirdName;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first name >>");
        firstName=input.next();
        System.out.println("Enter second name >>");
        secondName=input.next();
        System.out.println("Enter third name >>");
        thirdName=input.next();
        System.out.println("The possible name-combinations is: ");
        System.out.println(firstName+" "+secondName);
        System.out.println(firstName+" "+thirdName);
        System.out.println(secondName+" "+firstName);
        System.out.println(secondName+" "+thirdName);
        System.out.println(thirdName+" "+firstName);
        System.out.println(thirdName+" "+secondName);
    }
}
