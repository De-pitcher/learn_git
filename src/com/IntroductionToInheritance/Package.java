package com.IntroductionToInheritance;

public class Package {
    int weight;
    char shippingMtd;
    double shippingCost;
    public Package(int wgt,char sMtd){
        weight=wgt;
        shippingMtd=sMtd;
        calculateCost();
        display();
    }
    public void calculateCost(){
        if (weight>=1&&weight<=8){
            if (shippingMtd=='A')
                shippingCost=2;
            else if (shippingMtd=='T')
                shippingCost=1.50;
            else if (shippingMtd=='M')
                shippingCost=0.50;
        }else if (weight>=9&&weight<=16){
            if (shippingMtd=='A')
                shippingCost=3;
            else if (shippingMtd=='T')
                shippingCost=2.35;
            else if (shippingMtd=='M')
                shippingCost=2.35;
        }else {
            if (shippingMtd=='A')
                shippingCost=4.5;
            else if (shippingMtd=='T')
                shippingCost=3.25;
            else if (shippingMtd=='M')
                shippingCost=2.15;
        }
    }
    public void display(){
        System.out.println(weight+"kg for "+shippingMtd+" is $"+
                shippingCost);
    }
}
