package com.looping;

import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        int input;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Type in an even number and 999 to stop >>");
        input=keyboard.nextInt();
        while (input!=999){
            if(input%2==0)
                System.out.println("Good job!");
            else
                System.out.println("Error!");
            System.out.println("Type in an even number and 999 to stop >>");
            input=keyboard.nextInt();
        }
    }
}
