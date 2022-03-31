package com.IntroductionToInheritance;

public class CabinRental {
    int cabinNum;
    double weeklyRate;
    public CabinRental(int num){
    cabinNum=num;
        if (cabinNum==1||cabinNum==2||cabinNum==3){
            weeklyRate=950;
        }else
            weeklyRate=1100;
    }

    public int getCabinNum() {
        return cabinNum;
    }

    public double getWeeklyRate() {
        return weeklyRate;
    }
}
