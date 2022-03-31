package com.decisionMaking;

import java.util.Scanner;

public class AssignVolunteer2 {
    public static void main(String[] args) {
        int donationType;
        String volunteer;
        final int CLOTHING_CODE=1;
        final int FURNITURE_CODE=2;
        final int ELECTRONICS_CODE=3;
        final int OTHER_CODE=4;
        final String CLOTHING_PRICER="Regina";
        final String FURNITURE_PRICER="Walter";
        final String ELECTRONICS_PRICER="Lydia";
        final String OTHER_PRICER="Marco";
        String message;
        Scanner input=new Scanner(System.in);
        System.out.println("What type of donation is ths?");
        System.out.println("Enter an integer >> ");
        donationType= input.nextInt();
        switch(donationType){
            case (CLOTHING_CODE):
                volunteer=CLOTHING_PRICER;
                message="a clothing donation";
                System.out.println(" The volunteer who will price this item is " + volunteer);
                System.out.println("This is "+message);
                break;
            case (FURNITURE_CODE):
                volunteer=FURNITURE_PRICER;
                message="a furniture donation";
                System.out.println(" The volunteer who will price this item is " + volunteer);
                System.out.println("This is "+message);
                break;
            case (ELECTRONICS_CODE):
                volunteer=ELECTRONICS_PRICER;
                message="an electronics donation";
                System.out.println(" The volunteer who will price this item is " + volunteer);
                System.out.println("This is "+message);
                break;
            case (OTHER_CODE):
                volunteer=OTHER_PRICER;
                message="another donation type";
                System.out.println(" The volunteer who will price this item is " + volunteer);
                System.out.println("This is "+message);
                break;
            default:
                volunteer="invalid";
                message="an invalid donation type";
                System.out.println(" The volunteer who will price this item is " + volunteer);
                System.out.println("This is "+message);

        }
    }
}
