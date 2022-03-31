package com.looping;

import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        final int LIMIT=200;
        int var;
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to count > ");
        number = input.nextInt();
        // input.nextLine();
        for(var=0;var<=LIMIT;var+=number){
            System.out.print(var+" ");
            if(var==10||var==20||var==30||var==40||var==50
                    ||var==60||var==70||var==80||var==90||var==100
                    ||var==110||var==120||var==130||var==140||var==150
                    ||var==160||var==170||var==180||var==190||var==200) {
                //Display the number and a space
                System.out.println();
            }
        }
    }
}
