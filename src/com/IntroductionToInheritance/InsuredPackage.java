package com.IntroductionToInheritance;

public class InsuredPackage extends Package{
    double insurance;
    public InsuredPackage(int weight,char shipMtd){
        super(weight,shipMtd);
    }

    @Override
    public void calculateCost() {
        super.calculateCost();
        if (shippingCost>=0&&shippingCost<=1.0){
            insurance=2.45;
        }else if (shippingCost>=1.01&&shippingCost<=3.00)
            insurance=3.95;
        else
            insurance=5.55;
    }

    @Override
    public void display() {
        System.out.println(weight+"kg for "+shippingMtd+" is $"+
                shippingCost+" and additional costs due to " +
                "insurance is $"+insurance);
    }
}
