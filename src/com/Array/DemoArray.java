package com.Array;

public class DemoArray {
    public static void main(String[] args) {
        double [] salaries=new double[4];
        double []salaries1={6.25,6.55,10.25,16.85};
        salaries[0]=6.25;
        salaries[1]=6.55;
        salaries[2]=10.25;
        salaries[3]=16.85;
        System.out.println("Salaries one by one are:");
        for (int x=0;x<salaries.length;x++)
            System.out.println(salaries[x]);
    }
}
