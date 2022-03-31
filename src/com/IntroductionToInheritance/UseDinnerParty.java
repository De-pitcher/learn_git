package com.IntroductionToInheritance;

import java.util.Scanner;

public class UseDinnerParty {
    public static void main(String[] args) {
        int guests;
        int choice;
        Party aParty=new Party();
        DinnerParty aDinnerParty=new DinnerParty();
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter number of guest for the party >>");
        guests=keyboard.nextInt();
        aParty.setGuests(guests);
        System.out.println("Enter the menu option -- 1 for chicken" +
                " or 2 for beef >>");
        choice=keyboard.nextInt();
        aDinnerParty.setDinnerChoice(choice);
        System.out.println("The party has "+aParty.getGuests()+" guests");
        System.out.println("menu options "+aDinnerParty.getDinnerChoice()
        +" will be served");
        aDinnerParty.displayInvitation();
    }
}
