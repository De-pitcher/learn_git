package com.moreObjectConcept;

public class DemoBlock {
    public static void main(String[] args) {
        DemoBlock obj=new DemoBlock();
        calculateInterest(1000.0,0.04);
        calculateInterest(1000,4);
        System.out.println("Demonstrating block scope");
        int x = 1111;
        System.out.println("In first block x is " + x);
        int month=6,day=24,year=2014;
        displayDate(month);
        displayDate(month,day);
        displayDate(month,day,year);
        {
            int y = 2222;
            System.out.println("In second block x is " + x);
            System.out.println("In second block y is " + y);
        }
    }
    public static void calculateInterest(double bal,double rate){
        double interest;
        interest=bal*rate;
        System.out.println("Simple interest rate on $"+bal+" at "
                +rate+"% is $"+interest);
    }
    public static void calculateInterest(int bal,int rate){
        double interest;
        interest=bal*rate;
        System.out.println("Simple interest rate on $"+bal+" at "
                +rate+"% is $"+interest);
    }
    public static void displayDate(int mm){
        System.out.println("Event date: "+mm+"/24/2014");
    }
    public static void displayDate(int mm,int dd){
        System.out.println("Event date: "+mm+"/"+dd+"/2014");
    }
    public static void displayDate(int mm,int dd,int yy){
        System.out.println("Event date: "+mm+"/"+dd+"/"+yy);
    }
}
