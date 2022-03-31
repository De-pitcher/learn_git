package com.moreObjectConcept;

import java.util.Scanner;

public class GasPrices {
    double pricePerBarrel;
    public static void main(String[] args) {
        GasPrices gasPrices=new GasPrices();
        gasPrices.getPricePerBarrel();

    }
    public void getPricePerBarrel(){
        double price=3.5;
        double price1=4;
        double price2=4.2;
        double price3=4.8;
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter price >> ");
        pricePerBarrel=input.nextDouble();
        if(pricePerBarrel==100){
            System.out.println(" If the price of a barrel is $100 the" +
                    " price per gallon is between $"+price+" and $"+price1);
        }else if(pricePerBarrel==120){
            System.out.println("If the price of a barrel is $120 the" +
                    " price per gallon is between $"+price2+" and $"+price3);
        }else {
            System.out.println("You entered a wrong value. " +
                    "We only have price for $100 and $120");
        }
    }
}
