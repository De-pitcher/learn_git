package com.AdvancedArrayConcept;

import java.util.Scanner;

public class DayOfTheWeek {
    enum WEEK_DAYS{Monday,Tuesday,Wednesday,Thursday,Friday,
        Saturday,Sunday}

    public static void main(String[] args) {
        WEEK_DAYS week_days;
        for (WEEK_DAYS weekDays:WEEK_DAYS.values()) {
            System.out.println(weekDays+" ");
        }
        System.out.println("Choose a day >>");
        Scanner input=new Scanner(System.in);
        String selectDay;
        selectDay=input.next();
        week_days=WEEK_DAYS.valueOf(selectDay);
        switch (week_days){
            case Sunday:
                System.out.println("11am to 5pm");
                break;
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday:
                System.out.println("9am to 9pm");
                break;
            case Saturday:
                System.out.println("10am to 6pm");
        }
    }
}
