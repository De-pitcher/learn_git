package com.IntroductionToInheritance;

public class LeapYear extends Year{
    public LeapYear(){
        this.year=366;
    }

    @Override
    public void daysElapsed(String month, int day) {
        super.daysElapsed(month, day);
        switch (month) {
            case "January":
                num = 31 - day;
                break;
            case "February":
                num = (31 + 29) - day;
                break;
            case "March":
                num = (31 + 29 + 30) - day;
                break;
            case "April":
                num = (31 + 29 + 30 + 31) - day;
                break;
            case "May":
                num = (31 + 29 + 30 + 31 + 31) - day;
                break;
            case "June":
                num = (31 + 29 + 30 + 31 + 31 + 30) - day;
                break;
            case "July":
                num = (31 + 29 + 30 + 31 + 31 + 30 + 31) - day;
                break;
            case "August":
                num = (31 + 29 + 30 + 31 + 31 + 30 + 31 + 31) - day;
                break;
            case "September":
                num = (31 + 29 + 30 + 31 + 31 + 30 + 31 + 31 + 30) - day;
                break;
            case "October":
                num = (31 + 29 + 30 + 31 + 31 + 30 + 31 + 31 + 30 + 31) - day;
                break;
            case "November":
                num = (31 + 29 + 30 + 31 + 31 + 30 + 31 + 31 + 30 + 31 + 30) - day;
                break;
            case "December":
                num = (31 + 29 + 30 + 31 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31) - day;
                break;
        }
    }
}
