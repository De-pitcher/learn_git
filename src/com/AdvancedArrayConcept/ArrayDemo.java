package com.AdvancedArrayConcept;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] myScores=new int[5];
        display("Original array:            ",
        myScores);
        Arrays.fill(myScores,8);
        display("After filling with 8s:      ",
                myScores);
        myScores[2]=6;
        myScores[4]=3;
        Arrays.sort(myScores);
        display("After sorting:              ",
                myScores);
    }
    public static void display(String message, int[] array){
        System.out.println(message);
        for (int i : array)
            System.out.println(i + " ");
        System.out.println();
    }
}
