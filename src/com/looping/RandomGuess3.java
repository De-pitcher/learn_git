package com.looping;

import java.util.Scanner;

public class RandomGuess3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int guess,times=1;
        int LIMIT = 0;
        int ran;
        System.out.println("Enter guess >>");
        guess=input.nextInt();
        ran=((int)(Math.random()*100)%10+1);
        while(guess!=ran){
            if(guess<ran) {
                System.out.println("Too low");
            }else {
                System.out.println("Too high");
            }
            System.out.println("Try again > ");
            guess = input.nextInt();
           LIMIT=times+1;
        }
        if(guess==ran)
            System.out.println("Correct!");
        System.out.println("You guessed "+LIMIT+" times");

    }
}
