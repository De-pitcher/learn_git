package com.charactersStringsAndTheStringBuilder;

import java.util.Scanner;

public class PrepareTax {
    public static void main(String[] args) {
        TaxReturn obj=new TaxReturn();
        obj.setSosSecNum(obj.sosSecNum);
        obj.setfName(obj.fName);
        obj.setlName(obj.lName);
        obj.setStrAdd(obj.strAdd);
        obj.setCity(obj.city);
        obj.setState(obj.state);
        obj.setZipCode(obj.zipCode);
        obj.setAnnIncome(obj.annIncome);
        obj.setMarStatus(obj.marStatus);
        obj.display();
        String marSt;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter social security number: ");
        obj.sosSecNum=input.next();
        while (obj.sosSecNum.length()!=10&& !obj.sosSecNum.equals("###-###-####")){
            System.out.println("Enter your security number correctly: ");
            obj.sosSecNum=input.next();
        }
        System.out.println("Enter your first name: ");
        obj.fName=input.next();
        System.out.println("Enter your last name: ");
        obj.lName=input.next();
        System.out.println("Enter your street address: ");
        obj.strAdd=input.next();
        System.out.println("Enter your zip code: ");
        obj.zipCode=input.nextInt();
        while (!(obj.zipCode==5)){
            System.out.println("Enter zip code that is up to five digit: ");
            obj.zipCode=input.nextInt();
        }
        System.out.println("Enter your marital status: ");
        marSt=input.next();
        while (marSt.charAt(0)!='S'||marSt.charAt(0)!='s'||marSt.charAt(0)!='M'||marSt.charAt(0)!='m'){
            System.out.println("Enter a correct marital status: ");
            marSt=input.next();
            obj.marStatus=marSt.charAt(0);
        }
        obj.marStatus=marSt.charAt(0);
        System.out.println("Enter your annual income: ");
        obj.annIncome=input.nextInt();
    }
}
