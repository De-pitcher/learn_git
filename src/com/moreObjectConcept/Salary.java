package com.moreObjectConcept;

public class Salary {
    public static void main(String[] args) {
        Salary salary=new Salary();
        salary.calculateSalary(30,6,2);
    }
    public void calculateSalary(double hourRate,int regularHour,int overtime){
        double salary=regularHour+overtime*hourRate;
        System.out.println("Your salary is: $"+salary);
    }
}
