package com.decisionMaking;

import java.util.Scanner;

public class Pay {
    public static void main(String[] args) {
        double hourPayRate1=17.00,hourPayRate2=20.00,hourPayRate3=22.00;
        double medIns=32.50,dentIns=20.00,longTermDisIns=10.00;
        int hoursWorked;
        int skillLevel;
        double weeklyPay;
        double overtimePay;
        double overallPay;
        double totalPay;
        double insDed;
        int insurancePlan;
        int medInsNo=1,dentInsNo=2,longTermDisInsNo=3;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter hours worked per week >>");
        hoursWorked=input.nextInt();
        System.out.println("Enter skill level >>");
        skillLevel=input.nextInt();
        if(hoursWorked>=40) {
            if (skillLevel == 1){
                if(hoursWorked>40) {
                    totalPay = hoursWorked * hourPayRate1;
                    weeklyPay = 40 * hourPayRate1;
                    overtimePay = totalPay - weeklyPay;
                    overallPay=totalPay+overtimePay;
                    System.out.println("Total hours worked is "+hoursWorked);
                    System.out.println("The hourly pay rate is "+hourPayRate1);
                    System.out.println("The weekly pay is "+weeklyPay);
                    System.out.println("The overtime pay is "+overtimePay);
                    System.out.println("The total of regular and overtime pay is "+overallPay);
                        System.out.println("Choose an insurance plan >>");
                        insurancePlan = input.nextInt();
                        if (insurancePlan == medInsNo) {
                            insDed = weeklyPay - medIns;
                            System.out.println("The weekly insurance cost is $"+medIns);
                            System.out.println("Weekly insurance deduction is "+insDed);
                            if (insDed >= totalPay)
                                System.out.println("Error!!!");
                        }else if(insurancePlan==dentInsNo){
                            insDed = weeklyPay - dentIns;
                            System.out.println("The weekly insurance cost is $"+dentIns);
                            System.out.println("Weekly insurance deduction is "+insDed);
                            if (insDed >= totalPay)
                                System.out.println("Error!!!");
                        }else if(insurancePlan==longTermDisInsNo){
                            insDed = weeklyPay - longTermDisIns;
                            System.out.println("The weekly insurance cost is $"+longTermDisIns);
                            System.out.println("Weekly insurance deduction is "+insDed);
                            if (insDed >= totalPay)
                                System.out.println("Error!!!");

                        }
                    }
                }
            else if (skillLevel == 2){
                    if(hoursWorked>40) {
                        totalPay = hoursWorked * hourPayRate2;
                        weeklyPay = 40 * hourPayRate2;
                        overtimePay = totalPay - weeklyPay;
                        overallPay=totalPay+overtimePay;
                        System.out.println("Total hours worked is "+hoursWorked);
                        System.out.println("The hourly pay rate is "+hourPayRate2);
                        System.out.println("The weekly pay is "+weeklyPay);
                        System.out.println("The overtime pay is "+overtimePay);
                        System.out.println("The total of regular and overtime pay is "+overallPay);
                            System.out.println("Choose an insurance plan >>");
                            insurancePlan = input.nextInt();
                            if (insurancePlan == medInsNo) {
                                insDed = weeklyPay - medIns;
                                System.out.println("The weekly insurance cost is $"+medIns);
                                System.out.println("Weekly insurance deduction is "+insDed);
                                if (insDed >= totalPay)
                                    System.out.println("Error!!!");
                            }else if(insurancePlan==dentInsNo){
                                insDed = weeklyPay - dentIns;
                                System.out.println("The weekly insurance cost is $"+dentIns);
                                System.out.println("Weekly insurance deduction is "+insDed);
                                if (insDed >= totalPay)
                                    System.out.println("Error!!!");
                            }else if(insurancePlan==longTermDisInsNo){
                                insDed = weeklyPay - longTermDisIns;
                                System.out.println("The weekly insurance cost is $"+longTermDisIns);
                                System.out.println("Weekly insurance deduction is "+insDed);
                                if (insDed >= totalPay)
                                    System.out.println("Error!!!");

                            }
                        }
                    }
            else if (skillLevel == hourPayRate3){
                        if(hoursWorked>40) {
                            totalPay = hoursWorked * hourPayRate3;
                            weeklyPay = 40 * hourPayRate3;
                            overtimePay = totalPay - weeklyPay;
                            overallPay=totalPay+overtimePay;
                            System.out.println("Total hours worked is "+hoursWorked);
                            System.out.println("The hourly pay rate is "+hourPayRate3);
                            System.out.println("The weekly pay is "+weeklyPay);
                            System.out.println("The overtime pay is "+overtimePay);
                            System.out.println("The total of regular and overtime pay is "+overallPay);
                                System.out.println("Choose an insurance plan >>");
                                insurancePlan = input.nextInt();
                                if (insurancePlan == medInsNo){
                                    insDed = weeklyPay - medIns;
                                    System.out.println("The weekly insurance cost is $"+medIns);
                                    System.out.println("Weekly insurance deduction is "+insDed);
                                if (insDed >= totalPay)
                                    System.out.println("Error!!!");
                                }else if(insurancePlan==dentInsNo){
                                    insDed = weeklyPay - dentIns;
                                    System.out.println("The weekly insurance cost is $"+dentIns);
                                    System.out.println("Weekly insurance deduction is "+insDed);
                                    if (insDed >= totalPay)
                                        System.out.println("Error!!!");
                                }else if(insurancePlan==longTermDisInsNo){
                                    insDed = weeklyPay - longTermDisIns;
                                    System.out.println("The weekly insurance cost is $"+longTermDisIns);
                                    System.out.println("Weekly insurance deduction is "+insDed);
                                    if (insDed >= totalPay)
                                        System.out.println("Error!!!");
                                }
                            }
                        }
        }
    }
}