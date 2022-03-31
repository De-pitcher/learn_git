package com.Array;

import java.util.Scanner;

public class InputGrades {
    public static void main(String[] args) {
        final int NUM_STU=10;
        final int NUM_COURSES=5;
        int x;
        int i;
        int stuId;
        int hrs;
        String cId;
        String sGrade;
        char grade;
        Student[] students=new Student[NUM_STU];
        CollegeCourse[] obj=new CollegeCourse[NUM_COURSES];
        Scanner input=new Scanner(System.in);
        for (x=0;x<NUM_STU;++x){
            students[x]=new Student();
            System.out.println("Enter ID for student #"+
                    x);
            stuId=input.nextInt();
            students[x].setStuID(stuId);
            for (i=0;i<NUM_COURSES;++i){
                obj[i]=new CollegeCourse();
                System.out.println("Enter course ID #"+i);
                cId=input.next();
                System.out.println("Enter credit hours #"+i);
                hrs=input.nextInt();
                System.out.println("Enter the grade #"+i);
                sGrade=input.next();
                while (sGrade.length()>2) {
                    System.out.println("Enter the appropriate " +
                            "grade #"+i);
                    sGrade=input.next();
                }
                obj[i].setCourseID(cId);
                obj[i].setHrs(hrs);
                grade=sGrade.charAt(0);
                grade=Character.toUpperCase(grade);
                obj[i].setLetGrade(grade);
                students[x].setStudentCourses(obj[i],i);
            }
        }
        for (x=0;x<NUM_STU;++x){
            System.out.println("Student "+students[x].getStuID());
            for (i=0;i<NUM_COURSES;++i) {
                System.out.println(obj[i].getCourseID());
                System.out.println(obj[i].getHrs());
                System.out.println(obj[i].getLetGrade());
                System.out.println(students[x].getStudent(i));
            }
        }
    }
}
