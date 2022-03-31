package com.decisionMaking;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int guess1;
        int guess2;
        int guess3;
        int ran1;
        int ran2;
        int ran3;
        double award;
        final int LIMIT=10;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 3 guesses >>");
        System.out.println("Enter 1st guess >>");
        guess1=input.nextInt();
        System.out.println("Enter 2nd guess >>");
        guess2= input.nextInt();
        System.out.println("Enter 3rd guess >>");
        guess3= input.nextInt();
        Random ran=new Random();
        ran1=ran.nextInt(LIMIT);
        ran2=ran.nextInt(LIMIT);
        ran3=ran.nextInt(LIMIT);
        System.out.println("Your guesses are: ");
        System.out.println("\n Your guesses are "+guess1+" "+guess2+" "+guess3);
        System.out.println("\n Random guesses are "+ran1+" "+ran2+" "+ran3);
        if((guess1==ran1||guess1==ran2||guess1==ran3)||
                (guess2==ran1||guess2==ran2||guess2==ran3)
        ||(guess3==ran1||guess3==ran2||guess3==ran3)) {
            award = 10;
            System.out.println("You win $" + award);
        }else if(guess1==ran1&&guess2==ran2||
                guess1==ran1&&guess3==ran3||
                guess2==ran2&&guess3==ran3) {
            award = 100;
            System.out.println("You win $" + award);
        }else if(guess1==ran1||guess1==ran2||guess1==ran3&&
                guess2==ran1||guess2==ran2||guess2==ran3
                &&guess3==ran1||guess3==ran2||guess3==ran3) {
            award = 1000;
            System.out.println("You win $" + award);
        }else if(guess1==ran1&&guess2==ran2&&guess3==ran3){
            award=1000000;
        System.out.println("You win $"+award);
    }else {
            award=0;
            System.out.println("No match you win $"+award);
        }
}}
