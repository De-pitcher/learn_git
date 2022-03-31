package com.decisionMaking;

import java.util.Scanner;

public class CondoSales {
    public static void main(String[] args) {
        int codeType;
        String view;
        final int PARK_VIEW_CODE=1;
        final int GOLF_COURSE_VIEW_CODE=2;
        final int LAKE_VIEW_CODE=3;
        final  String PARK_VIEW="Park view";
        final String GOLF_COURSE_VIEW="Golf course view";
        final String LAKE_VIEW="Lake view";
        final String GARAGE="garage";
        final String PARKING_SPACE="parking space";
        double price;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter view >>");
        System.out.println("\n1 for "+PARK_VIEW+" 2 for "+
                GOLF_COURSE_VIEW +" 3 for "+LAKE_VIEW);
        codeType=input.nextInt();
        if(codeType==PARK_VIEW_CODE||codeType==
                GOLF_COURSE_VIEW_CODE||codeType==LAKE_VIEW_CODE){
            System.out.println("Enter >> "+PARK_VIEW_CODE+
                    " for garage or "+GOLF_COURSE_VIEW_CODE
            +" for parking space");
            codeType= input.nextInt();
            if (codeType==PARK_VIEW_CODE) {
                view = GARAGE;
                price = 5000;
                System.out.println("Park at the " + view);
                System.out.println("Price is " + price);
            }else if(codeType==GOLF_COURSE_VIEW_CODE){
                view=PARKING_SPACE;
            price = 5000;
            System.out.println("Park at the " + view);
            System.out.println("Price is " + price);
        }else {
                price=5000;
                System.out.println(price+" for condo" +
                        " without lake view");
            }

    }
        switch (codeType){
            case (PARK_VIEW_CODE):
                view=PARK_VIEW;
                price=150000;
                System.out.println("The view chosen is "+view);
                System.out.println("\nThe price is $"+price);
                break;
            case (GOLF_COURSE_VIEW_CODE):
                view=GOLF_COURSE_VIEW;
                price=170000;
                System.out.println("The view chosen is "+view);
                System.out.println("\nThe price is $"+price);
                break;
            case (LAKE_VIEW_CODE):
                view=LAKE_VIEW;
                price=210000;
                System.out.println("The view chosen is "+view);
                System.out.println("\nThe price is $"+price);
                break;
            default:
                view="Invalid";
                price=0;
                System.out.println("The view chosen is "+view);
                System.out.println("\nThe price is $"+price);
        }
    }
}
