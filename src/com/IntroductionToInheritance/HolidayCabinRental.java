package com.IntroductionToInheritance;

public class HolidayCabinRental extends CabinRental{
    public HolidayCabinRental(int roomNum){
        super(roomNum);
        weeklyRate+=150;
    }
}
