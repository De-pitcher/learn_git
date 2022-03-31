package com.moreObjectConcept;

import java.util.Scanner;

public class TesBankAccount {
    public static void main(String[] args) {
        BankAccount user1=new BankAccount();
        BankAccount user2=new BankAccount();
        BankAccount user3=new BankAccount();
        user1=getData(user1);
        user2=getData(user2);
        user3=getData(user3);
        System.out.println("Name: "+user1.getAccountName()+" Account number: "+user1.getAccountNumber()+" and balance: $"+user1.getAccountBalance());
        System.out.println("Name: "+user2.getAccountName()+" Account number: "+user2.getAccountNumber()+" and balance: $"+user2.getAccountBalance());
        System.out.println("Name: "+user3.getAccountName()+" Account number: "+user3.getAccountNumber()+" and balance: $"+user3.getAccountBalance());

    }
    public static BankAccount getData(BankAccount info){
        String accName;
        int accNum;
        double accBal;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter account name >>");
        accName=input.nextLine();
        System.out.println("Enter account number >>");
        accNum=input.nextInt();
        System.out.println("Enter account balance >>");
        accBal= input.nextDouble();
        info.setAccountName(accName);
        info.setAccountNumber(accNum);
        info.setAccountBalance(accBal);
        return info;
    }
}
