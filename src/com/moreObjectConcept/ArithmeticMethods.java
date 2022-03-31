package com.moreObjectConcept;

public class ArithmeticMethods {
    public static void main(String[] args) {
       ArithmeticMethods obj=new ArithmeticMethods();
       obj.displayNumberPlus10(10,5);
       obj.displayNumberPlus100(10,5);
       obj.displayNumberPlus1000(10,5);
    }
    public void displayNumberPlus10(int a,int b){
        int result=a+b-5;
        System.out.println(a+"  and "+b+" will be equal to: "+result);
    }
    void displayNumberPlus100(int a,int b){
        int result=a*b+50;
        System.out.println(a+" and "+b+" will be equal to: "+result);
    }
    void displayNumberPlus1000(int a,int b){
        int result=a*b*100/5;
        System.out.println(a+" and "+b+" will be equal to: "+result);
    }
}
