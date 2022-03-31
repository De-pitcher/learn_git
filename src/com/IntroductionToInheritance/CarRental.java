package com.IntroductionToInheritance;

public class CarRental {
    String rName;
    int zipCOde;
    String  size;
    double dRate;
    int lengthOfRental;
    double totalRntFee;
    public CarRental(String name,int zCode,String size,int lOfDays){
        switch (size) {
            case "economy":
                dRate = 29.99;
                break;
            case "midsize":
                dRate = 38.9;
                break;
            case "full size":
                dRate = 43.50;
                break;
        }
        totalRntFee=lOfDays*dRate;
        this.rName=name;
        this.zipCOde=zCode;
        this.size=size;
        this.lengthOfRental=lOfDays;
    }
    public void display(){
        System.out.println(size+" at $"+dRate+" per day");
        System.out.println("Total is $"+totalRntFee);
    }
}
