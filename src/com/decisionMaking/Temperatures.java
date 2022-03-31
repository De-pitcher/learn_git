package com.decisionMaking;

import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {
        //int highTemp ;
        //int lowTemp;
        int temp;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter current temperature >>");
        temp=input.nextInt();
        if(temp>=90) {
            System.out.println("Heat warning!");
        }else if(temp<32) {
            System.out.println("Freezing warning!");
        }
                System.out.println("Large temperature swing");
    }
}
