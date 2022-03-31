package com.decisionMaking;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        int chooseCoffee1;
        int chooseCoffee2;
        int chooseCoffee3;
        double price;
        final double AMERICANO=1.99;
        final double ESPRESSO=2.50;
        final double LATTE=2.15;
        final int americano=1;
        final int espresso=2;
        final int latte=3;
        final int quit=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter "+americano+" for Americano, "+
                espresso+" for Espresso, "+latte+" for Latte, and "
        +quit+" to Quit");
        chooseCoffee1=input.nextInt();
        if (chooseCoffee1==quit) {
            price = 0;
            System.out.println("Total bill of $" + price);
        }else
            System.out.println("Enter "+americano+" for Americano, "+
                    espresso+" for Espresso, "+latte+" for Latte, and "
                    +quit+" to Quit");
        chooseCoffee2=input.nextInt();
        if(chooseCoffee2==quit)
            System.out.println(chooseCoffee1);
        else if(chooseCoffee2==americano||chooseCoffee2==espresso
        ||chooseCoffee2==latte) {
            System.out.println(chooseCoffee1 + chooseCoffee2);
            System.out.println("Enter " + americano + " for Americano, " +
                    espresso + " for Espresso, " + latte + " for Latte, and "
                    + quit + " to Quit");
            chooseCoffee3=input.nextInt();
        if(chooseCoffee3==quit)
            System.out.println(chooseCoffee1+chooseCoffee2);
        else
            System.out.println(chooseCoffee1+chooseCoffee2+chooseCoffee3);
        switch (chooseCoffee1){
            case (americano):
                price=AMERICANO;
                System.out.println("Total bill of $" + price);
                break;
            case (espresso):
                price=ESPRESSO;
                System.out.println("Total bill of $" + price);
                break;
            case (latte):
                price=LATTE;
                System.out.println("Total bill of $"+ price);
                break;
            default:

        }switch (chooseCoffee2){
                case (americano):
                    price=AMERICANO;
                    System.out.println("Total bill of $" + price);
                    break;
                case (espresso):
                    price=ESPRESSO;
                    System.out.println("Total bill of $" + price);
                    break;
                case (latte):
                    price=LATTE;
                    System.out.println("Total bill of $"+ price);
                    break;
            }
            switch (chooseCoffee3){
                case (americano):
                    price=AMERICANO;
                    System.out.println("Total bill of $" + price);
                    break;
                case (espresso):
                    price=ESPRESSO;
                    System.out.println("Total bill of $" + price);
                    break;
                case (latte):
                    price=LATTE;
                    System.out.println("Total bill of $"+ price);
                    break;
            }
    }
}}
