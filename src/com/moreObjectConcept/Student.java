package com.moreObjectConcept;

public class Student {
    private int number;
    private double gpa;
    public Student(int num,double avg){
        number=num;
        gpa=avg;
    }
    public Student(double avg){
        this(999,avg);
    }
    public Student(int num){
        this(num,0.0);
    }
    public Student(){
       this(999,0.0);
    }
}




