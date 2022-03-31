package com.decisionMaking;

public class DigitalCamera {
    String cameraBrand;
    int numOfMegapixel;
    double camPrice;
    public DigitalCamera(String brand,int megapixel){
        numOfMegapixel=megapixel;
        cameraBrand=brand;
        if(megapixel>10)
            numOfMegapixel=10;
        if(megapixel<=6)
            camPrice=99.00;
        else if(megapixel>6)
            camPrice=129.00;
    }
    public void display(){
        System.out.println("The megapixel is "+numOfMegapixel);
        System.out.println("The price for the camera you ordered is $"+camPrice);
    }
}
