package com.Array;

import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        final int NUM_ARRAYS = 20;
        String[] names = new String[NUM_ARRAYS];
        int[] pNumbers = new int[NUM_ARRAYS];
        String eName;
        String vName;
        int eNum;
        int count = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name >>");
        eName = input.next();
        if (!(eName.equals("zzz"))) {
            names[0] = eName;
            System.out.println("Enter phone number >>");
            eNum = input.nextInt();
            pNumbers[0] = eNum;
        }
        while (count< NUM_ARRAYS&& !eName.equals("zzz")) {
            System.out.println("Enter name >> ");
                eName = input.next();
            if (!(eName.equals("zzz")))
                names[count] = eName;
                System.out.println("Enter phone number >>");
                eNum = input.nextInt();
            if (!(eName.equals("zzz")))
                pNumbers[count] = eNum;
                count++;
        }
                System.out.println("You have entered " + (count-1));
        if (names[0]!=null){
        for (int x=0;x<NUM_ARRAYS;++x) {
            if (names[x] == null)
                x = NUM_ARRAYS;
            else
            System.out.println(" " + names[x]);
            }
        }
            for (int i = 0; i < NUM_ARRAYS; ++i) {
                if (names[0] != null) {
                    System.out.println("Type in the  name you want " +
                            "to view the number >>");
                    vName = input.next();
                    for (int j = 0; j < NUM_ARRAYS; ++j) {
                        if (vName.equals(names[j]))
                            System.out.println(pNumbers[j]);
                    }
                }
                i = NUM_ARRAYS;
            }
    }
}
