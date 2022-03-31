package com.AdvancedArrayConcept;

import java.util.Scanner;

public class EnumDemo {
    enum Month{JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC}

    public static void main(String[] args) {
        Month birthMonth;
        String userEntry;
        int position;
        int comparison;
        Scanner input =new Scanner(System.in);
        for (Month mon:Month.values())
            System.out.println(mon+" ");
        System.out.println("\nEnter the first three letters" +
                " of your birth month >> ");
        userEntry=input.nextLine().toUpperCase();
        birthMonth=Month.valueOf(userEntry);
        System.out.println("You entered "+birthMonth);
        position=birthMonth.ordinal();
        System.out.println("Birth month is in position "+position);
        comparison=birthMonth.compareTo(Month.JUN);
        if (comparison<0)
            System.out.println(birthMonth+" is earlier in the " +
                    "year than "+Month.JUN);
        else if (comparison>0)
            System.out.println(birthMonth+" is later in the " +
                    "year than "+Month.JUN);
        else
            System.out.println(birthMonth+" is "+Month.JUN);

    }
}
