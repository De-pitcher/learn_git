package com.decisionMaking;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        final int ROCK=1;
        final int SCISSORS=2;
        final int PAPER=3;
        int ran1,ran2,ran3;
        int input1,input2,input3;
        Scanner keyboard=new Scanner(System.in);
        final int LAST_NUM=3;
        ran1=((int)(Math.random()*100)%LAST_NUM+1);
        System.out.println("Input the first value >>");
        input1=keyboard.nextInt();
        ran2=((int)(Math.random()*100)%LAST_NUM+1);
        System.out.println("Input the second value >>");
        input2=keyboard.nextInt();
        ran3=((int)(Math.random()*100)%LAST_NUM+1);
        System.out.println("Input the last value >>");
        input3=keyboard.nextInt();
        if(ran1==ROCK||ran2==ROCK||ran3==ROCK)
            System.out.println("Rock");
        else if (ran1 == SCISSORS || ran2 == SCISSORS || ran3 == SCISSORS)
                System.out.println("Scissors");
            else if (ran1 == PAPER || ran2 == PAPER || ran3 == PAPER)
                System.out.println("Paper");
            if (input1 == ROCK || input2 == ROCK || input3 == ROCK)
                System.out.println("Rock");
            else if (input1 == SCISSORS || input2 == SCISSORS || input3 == SCISSORS)
                System.out.println("Scissors");
            else if (input1 == PAPER || input2 == PAPER || input3 == PAPER)
                System.out.println("Paper");

        if(ran1==ROCK&&input1==ROCK||ran1==SCISSORS&&input1==SCISSORS
        ||ran1==PAPER&&input1==PAPER)
            System.out.println("It is a tie");
        else if(ran2==ROCK&&input2==ROCK||ran2==SCISSORS&&input2==SCISSORS
                ||ran2==PAPER&&input2==PAPER)
            System.out.println("It is a tie");
        else if(ran3==ROCK&&input3==ROCK||ran3==SCISSORS&&input3==SCISSORS
                ||ran3==PAPER&&input3==PAPER)
            System.out.println("It is a tie");

         if(ran1==ROCK&&input1==SCISSORS||ran1==SCISSORS&&input1==PAPER
        ||ran1==PAPER&&input1==ROCK)
            System.out.println("Computer wins");
        else if(ran2==ROCK&&input2==SCISSORS||ran2==SCISSORS&&input2==PAPER
                ||ran2==PAPER&&input2==ROCK)
            System.out.println("Computer wins");
        else if(ran3==ROCK&&input3==SCISSORS
                ||ran3==SCISSORS&&input3==PAPER||ran3==PAPER&&input3==ROCK)
            System.out.println("Computer wins");

            if(input1==ROCK&&ran1==SCISSORS||input1==SCISSORS&&ran1==PAPER
                ||input1==PAPER&&ran1==ROCK)
            System.out.println("Player wins");
        else if(input2==SCISSORS&&ran2==ROCK||input2==SCISSORS&&ran2==PAPER
                ||input2==PAPER&&ran2==ROCK)
            System.out.println("Player wins");
        else if(input3==ROCK&&ran3==SCISSORS
                ||input3==SCISSORS&&ran3==PAPER||input3==PAPER&&ran3==ROCK)
            System.out.println("Player wins");

    }
}
