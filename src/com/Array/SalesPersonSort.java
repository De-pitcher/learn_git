package com.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SalesPersonSort {
    public static void main(String[] args) {
        Salesperson[] salesperson=new Salesperson[3];
        Scanner input=new Scanner(System.in);
        int Id,count=0,select;
        double salary;
        while (count<salesperson.length){
            System.out.println("Enter your ID number >>");
            salesperson[count]=new Salesperson();
            Id=input.nextInt();
            salesperson[count].setID(Id);
            System.out.println("Enter your salary >>");
            salary=input.nextDouble();
            salesperson[count].setAnnualSal(salary);
            count++;
        }
        System.out.println("Select the field field " +
                "you want to sort with");
        System.out.println("Select 1 to use ID" +
                "or 2 to use salary");
        select=input.nextInt();
        if (select==1){
            Arrays.sort(salesperson);
        }else {
            Arrays.sort(salesperson, Comparator.comparingDouble(Salesperson::getAnnualSal));
        }
        for (Salesperson salPerson:salesperson){
            System.out.println(" "+salPerson.getID());
            System.out.println(" "+salPerson.getAnnualSal());
        }
    }
}
