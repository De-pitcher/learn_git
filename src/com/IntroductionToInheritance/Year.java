package com.IntroductionToInheritance;

public class Year {
    int year;
    int num;
    public Year(){
        year=365;
    }

    public int getYear() {
        return year;
    }
    public void daysElapsed(String month,int day){
        switch (month) {
            case "January":
                num = 31 - day;
                break;
            case "February":
                num = (31 + 28) - day;
                break;
            case "March":
                num = (31 + 28 + 30) - day;
                break;
            case "April":
                num = (31 + 28 + 30 + 31) - day;
                break;
            case "May":
                num = (31 + 28 + 30 + 31 + 31) - day;
                break;
            case "June":
                num = (31 + 28 + 30 + 31 + 31 + 30) - day;
                break;
            case "July":
                num = (31 + 28 + 30 + 31 + 31 + 30 + 31) - day;
                break;
            case "August":
                num = (31 + 28 + 30 + 31 + 31 + 30 + 31 + 31) - day;
                break;
            case "September":
                num = (31 + 28 + 30 + 31 + 31 + 30 + 31 + 31 + 30) - day;
                break;
            case "October":
                num = (31 + 28 + 30 + 31 + 31 + 30 + 31 + 31 + 30 + 31) - day;
                break;
            case "November":
                num = (31 + 28 + 30 + 31 + 31 + 30 + 31 + 31 + 30 + 31 + 30) - day;
                break;
            case "December":
                num = (31 + 28 + 30 + 31 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31) - day;
                break;
        }
        System.out.println("We have "+year+" this year");
        System.out.println(month+" "+day+" in non-leap year,"+
                num+" days has elapsed");
    }
}
