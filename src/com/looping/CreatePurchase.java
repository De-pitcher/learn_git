package com.looping;

import java.util.Scanner;

public class CreatePurchase {
    public static void main(String[] args) {
        int iNum;
        double sAmt;
        double tSAmt;
        Purchase obj = new Purchase();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter invoice number >> ");

        iNum = input.nextInt();
       while (iNum <= 1000 || iNum >= 8000) {
           System.out.println("Enter the correct invoice number >>");
           iNum = input.nextInt();
       }
        System.out.println("Enter the amount of sale >>");
        obj.setInvoiceNum(iNum);
            sAmt = input.nextDouble();
            while (sAmt <1) {
                System.out.println("Enter the correct amount of sales >>");
                sAmt = input.nextDouble();
            }
                obj.setSalAmt(sAmt);
        System.out.println("Enter the amount of sales tax >>");
                tSAmt = input.nextDouble();

                obj.setTaxSalAmt(tSAmt);
                obj.display();

            }
        }

