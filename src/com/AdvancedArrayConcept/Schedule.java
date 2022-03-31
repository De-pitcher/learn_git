package com.AdvancedArrayConcept;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        String[][] schedule;
        schedule= new String[][]{{"GS 105", " MAT 101", "PHY 102",
                "EDU 111"}, {"Mon 8:45", "Tues 10:00",
                "Fri 12:30", "Wes 1:00"}};
        String courseName;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name of the course >>");
        courseName=input.nextLine();
        for (int i=0;i< schedule.length;++i){
        if (courseName.equals(schedule[0][i])) {
            System.out.println(" " + schedule[1][i]);
            }else
            System.out.println("The course does not exist!");
        i= schedule.length-1;
        }
    }
}
