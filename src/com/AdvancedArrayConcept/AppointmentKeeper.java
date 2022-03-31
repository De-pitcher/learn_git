package com.AdvancedArrayConcept;

import java.util.Scanner;

public class AppointmentKeeper {
    public static void main(String[] args) {
        String[][] database = new String[31][24];
        String dyAndHr;
        int choose;
        final int QUIT = 99;
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count < database.length) {
            int count2 = 0;
            while (count2 < database[count].length) {
                System.out.println("Enter an hour and the " +
                        "schedule you want to add >>");
                dyAndHr = input.nextLine();
                database[count][count2] = dyAndHr;
                count2++;
            }
            count++;
        }
        System.out.println("Enter a day to see what is scheduled" +
                ", or " + QUIT + " to quit");
        choose = input.nextInt();
        int count3 = 0;
        while (choose != QUIT) {
            for (int i = 0; i < database[count3].length; ++i) {
                System.out.println(" " + database[count3][i]);
            }
            
            System.out.println("Enter a day to see what is scheduled" +
                    ", or " + QUIT + " to quit");
            choose = input.nextInt();
        }
    }
}