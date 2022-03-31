package com.looping;

import java.util.Scanner;

public class RetirementGoal {
    public static void main(String[] args) {
        int currentAge,remainingAge;
        double amtToSave,totalAmt;
        final int AGE_LIMIT=60;
        Scanner input=new Scanner(System.in);
        System.out.println("A calculator for age remaining " +
                "\nand total amount that can be saved from " +
                "\nnow");
        System.out.println("Enter your current age >>");
        currentAge=input.nextInt();
        System.out.println("Enter the amount you want to save >>");
        amtToSave=input.nextInt();
        if (currentAge<=0){
        while (currentAge<=0) {
            System.out.println("\nEnter a valid age >>");
            currentAge = input.nextInt();
        }
        }
        remainingAge = AGE_LIMIT - currentAge;
        System.out.println("Remaining age is "+remainingAge+"yrs");
        if (amtToSave<=0){
            while (amtToSave<=0) {
                System.out.println("\nEnter a valid amount >>");
                amtToSave = input.nextDouble();
            }
        }
        totalAmt = (AGE_LIMIT - currentAge) * amtToSave;
        System.out.println("Total amount to be saved before "
                + AGE_LIMIT + "yrs from now is " + totalAmt);


    }
}
