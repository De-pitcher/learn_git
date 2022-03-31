package com.moreObjectConcept;

import java.util.Scanner;

public class MethodThatUseEmployee {
    public static void main(String[] args) {
        Employee myEmployee;
        myEmployee=getEmployeeData();
        displayEmployee(myEmployee);
    }
    public static Employee getEmployeeData(){
        Employee tempEmp=new Employee();
        int id;
        double sal;
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter Employee ID >> ");
        id= input.nextInt();
        tempEmp.setEmpNum(id);
        System.out.println(" Enter Employee's Salary >> ");
        sal=input.nextDouble();
        tempEmp.setEmpSalary(sal);
        return tempEmp;
    }
    public static void displayEmployee(Employee anEmp){
        System.out.println("\nEmployee # "+anEmp.getEmpNum()+
                " Salary is "+anEmp.getEmpSalary());
    }
}
