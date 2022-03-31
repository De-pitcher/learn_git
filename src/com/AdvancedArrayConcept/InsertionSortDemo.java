package com.AdvancedArrayConcept;

import java.util.Scanner;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] someNums=new int[5];
        Scanner input=new Scanner(System.in);
        int a,b,temp;
        for (a=0;a<someNums.length;++a){
            System.out.println("Enter number "+(a+1)+" >>");
            someNums[a]=input.nextInt();
        }
        display(someNums,0);
        a=1;
        while (a<someNums.length){
            temp=someNums[a];
            b=a-1;
            while (b>=0&&someNums[b]>temp){
                someNums[b+1]=someNums[b];
                --b;
            }
            someNums[b+1]=temp;
            display(someNums,a);
            ++a;
        }
    }
    public static void display(int[] someNums,int a){
        System.out.println("Iteration "+a+": ");
        for (int someNum : someNums)
            System.out.println(someNum + " ");
        System.out.println();
    }

}
