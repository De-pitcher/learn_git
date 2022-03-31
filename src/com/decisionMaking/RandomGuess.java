package com.decisionMaking;

import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int guess;
        int ran;
        System.out.println("Enter guess >>");
        guess=input.nextInt();
        ran=((int)(Math.random()*100)%10+1);
        if(guess==ran)
            System.out.println("Correct!");
        else if(guess<ran)
            System.out.println("Too low");
        else
            System.out.println("Too high");
    }
}
