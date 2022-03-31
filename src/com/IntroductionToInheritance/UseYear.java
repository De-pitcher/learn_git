package com.IntroductionToInheritance;

public class UseYear {
    public static void main(String[] args) {
        Year year=new LeapYear();
        year.daysElapsed("December",16);
        LeapYear lYear=new LeapYear();
        lYear.daysElapsed("March",8);
    }
}
