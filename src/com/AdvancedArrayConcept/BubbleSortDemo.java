package com.AdvancedArrayConcept;

import java.util.Scanner;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] someNums=new int[5];
        int comparisonToMake=someNums.length-1;
        Scanner input=new Scanner(System.in);
        int a,b,temp;
        for (a=0;a<someNums.length;++a){
            System.out.println("Enter number "+(a+1)+" >>");
            someNums[a]=input.nextInt();
        }
        display(someNums,0);
        for(a=0;a<someNums.length-1;++a){
            for(b=0;b<comparisonToMake;++b){
                if (someNums[b]>someNums[b+1]){
                    temp=someNums[b];
                    someNums[b]=someNums[b+1];
                    someNums[b+1]=temp;
                }
            }
            display(someNums,(a+1));
            --comparisonToMake;
        }
    }
    public static void display(int[] someNums,int a){
        System.out.println("Iteration "+a+": ");
        for (int someNum : someNums)
            System.out.println(someNum + " ");
        System.out.println();
    }

}
