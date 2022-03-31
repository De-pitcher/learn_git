package com.decisionMaking;

public class TestDigitalCamera {
    public static void main(String[] args) {
        DigitalCamera obj1=new DigitalCamera("Canon",15);
        DigitalCamera obj2=new DigitalCamera("Canon",7);
        DigitalCamera obj3=new DigitalCamera("Canon",5);
        DigitalCamera obj4=new DigitalCamera("Canon",6);
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}
