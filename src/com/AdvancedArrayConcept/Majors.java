package com.AdvancedArrayConcept;

import java.util.Scanner;

public class Majors {
    enum Course{ACC,CHEM,CIS,ENG,HIS,PHYS}

    public static void main(String[] args) {
        String maj;
        Course course;
        for (Course c:Course.values()) {
            System.out.println(c+" ");
        }
        System.out.println("Enter a major >>");
        Scanner input=new Scanner(System.in);
        maj=input.next();
        course=Course.valueOf(maj);
        switch (course){
            case ACC:
            case CIS:
                System.out.println("Business division");
                break;
            case CHEM:
            case PHYS:
                System.out.println("Science division");
                break;
            case ENG:
            case HIS:
                System.out.println("Humanities division");
        }
    }
}
