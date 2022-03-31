package com.Array;

import java.util.Scanner;

public class CarpentryChoice {
    public static void main(String[] args) {
        final int NUM_ITEMS=4;
        String[] items={"table","desk","dresser","entertainment"
            ,"center"};
        String select;
        double[] price={250,325,420,600};
        double itemPrice=0.0;
        boolean valid=false;
        int x;
        Scanner input=new Scanner(System.in);
        System.out.println("The list of available items is ");
        for (x=0;x<items.length;++x)
            System.out.println(items[x]);
        System.out.println("Enter any of them to view the " +
                "price >> ");
        select=input.nextLine();
        for (x=0;x<NUM_ITEMS;++x){
            if (select.equals(items[x])){
                valid=true;
                itemPrice=price[x];
                x=NUM_ITEMS;
            }else {
                for (int i=0;i<items[x].length();++i){
                    if (select.charAt(0)==items[x].charAt(0)
                    &&select.charAt(1)==items[x].charAt(1)
                            &&select.charAt(2)==items[x].charAt(2)){
                        valid=true;
                        itemPrice=price[x];
                        x=NUM_ITEMS;
                    }
                }
            }
            if (valid){
                System.out.println("The price of the selected"
                        + " items is &"+itemPrice);
            }else
                System.out.println("Invalid item entered!");
        }
    }
}
