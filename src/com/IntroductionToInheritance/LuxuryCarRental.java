package com.IntroductionToInheritance;

import java.util.Scanner;

public class LuxuryCarRental extends CarRental{
    public LuxuryCarRental(String name,int zCode,String size,int lOfDays){
        super(name, zCode, size, lOfDays);
        dRate=79.99;
    }

    @Override
    public void display() {
        System.out.println("Luxury at $"+dRate+" per day");
        System.out.println("Total is $"+totalRntFee);
        Scanner input=new Scanner(System.in);
        System.out.println("Select chauffeur for $200 per day");
        size=input.nextLine();
        dRate=200;
        totalRntFee=dRate*lengthOfRental;
        System.out.println("Luxury at $"+dRate+" per day");
        System.out.println("Total is $"+totalRntFee);
    }
}
