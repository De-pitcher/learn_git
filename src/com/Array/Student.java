package com.Array;

public class Student {
    int stuID;
    final int NUM_STU=5;
    CollegeCourse[] collegeCourses=new
            CollegeCourse[NUM_STU];

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public int getStuID() {
        return stuID;
    }
    public CollegeCourse getStudent(int pos){
            return collegeCourses[pos];
    }
    public void setStudentCourses(CollegeCourse c,int pos){
        c=collegeCourses[pos];
    }
}
