package com.looping;

import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        double balance;
        int response;
        int year=1;
        final double INT_RATE=0.03;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter initial bank balance > ");
        balance=input.nextDouble();
        input.nextLine();
        do{
            balance= balance+balance*INT_RATE;
            System.out.println("After year "+year+" at "+INT_RATE
                    +" interest rate, balance is $"+balance);
            year=year+1;
            System.out.println("\nDo you want to see the balance "+
                    "at the end of another year?");
            System.out.println(" Enter 1 for yes");
            System.out.println(" or any other number for no >> ");
            response=input.nextInt();
        }while(response==1);
    }
}
