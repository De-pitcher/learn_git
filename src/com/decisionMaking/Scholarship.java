package com.decisionMaking;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        double grade;
        int numOfExtraCurriAct;
        int numOfServiceAct;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter yor grade >>");
        grade=input.nextInt();
        System.out.println("Enter the number of service activities");
        numOfServiceAct=input.nextInt();
        System.out.println("Enter number of extracurricular activities");
        numOfExtraCurriAct=input.nextInt();
        if(grade>=3.8&&numOfExtraCurriAct==1&&numOfServiceAct==1)
            System.out.println("Scholarship candidate");
        else if(grade<3.8&&grade>3.4
                &&numOfExtraCurriAct>=3&&numOfServiceAct>=3)
            System.out.println("Scholarship candidate");
        else if(grade<3.4&&grade>3.0&&numOfExtraCurriAct>=2&&numOfServiceAct==3)
            System.out.println("Scholarship candidate");
        else
            System.out.println("Not a candidate");
    }
}
