package com.decisionMaking;

import java.util.Scanner;

public class AssignVolunteer {
    public static void main(String[] args) {
        int donationType;
        String volunteer;
        final int CLOTHING_CODE=1;
        final int ANYTHING_ELSE=2;
        final int OTHER_CODE=3;
        final String CLOTHING_PRICER="Regina";
        final String OTHER_PRICER="Marco";
        String message;

        Scanner input=new Scanner(System.in);
        System.out.println("What type of donation is ths?");
        System.out.println("Enter "+CLOTHING_CODE+" for clothing " +
                ANYTHING_ELSE+" for anything else... "+OTHER_CODE);
        donationType=input.nextInt();
        if(donationType==CLOTHING_CODE) {
            volunteer = CLOTHING_PRICER;
            message = " a clothing donation";

            System.out.println(" The volunteer who will price this item is " + volunteer);
            System.out.println("This is "+message);
        }else if(donationType==ANYTHING_ELSE){
            volunteer = OTHER_PRICER;
            message="another donation type";
            System.out.println(" The volunteer who will price this item is " + volunteer);
            System.out.println("You entered " + donationType);
        }else {
            message="an invalid type";

        }
        System.out.println("This is "+message);
            System.out.println(" The volunteer who will price this item is " +message);

    }
}
