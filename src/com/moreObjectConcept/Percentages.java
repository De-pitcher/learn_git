package com.moreObjectConcept;

public class Percentages {
    double a=20;
    double b=100;
    public static void main(String[] args) {
        Percentages percentages=new Percentages();
        percentages.computePercent();
    }
    public void computePercent(){
        System.out.println(a+" is the 20% of "+b);
    }
}
