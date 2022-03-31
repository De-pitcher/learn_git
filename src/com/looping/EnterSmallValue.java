package com.looping;

import java.util.Scanner;

public class EnterSmallValue {
    public static void main(String[] args) {
        int userEntry;
        final int LIMIT=3;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter an integer no higher than "
        +LIMIT+" > ");
        userEntry=input.nextInt();
        while (userEntry>LIMIT){
            System.out.println("The number you entered was too high");
            System.out.print("Enter an integer no higher than "+
                    LIMIT+" > ");
            userEntry=input.nextInt();
        }
    }
}
