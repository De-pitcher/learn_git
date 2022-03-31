package com.IntroductionToInheritance;

public class DemoCabinRental {
    public static void main(String[] args) {
        CabinRental cabinRental=new CabinRental(3);
        HolidayCabinRental hRental=new HolidayCabinRental(5);
        System.out.println("Cabin "+cabinRental.getCabinNum()+" is $"
        +cabinRental.getWeeklyRate()+" per week");
        System.out.println("Cabin "+hRental.getCabinNum()+" is $"
                +hRental.getWeeklyRate()+" per week");
    }
}
