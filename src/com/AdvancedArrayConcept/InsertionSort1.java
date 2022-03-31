package com.AdvancedArrayConcept;

public class InsertionSort1 {
    public static void main(String[] args) {
        int[] someNums={90,85,65,95,75};
        int a,b,temp;
        a=1;
        while (a<someNums.length){
            temp=someNums[a];
            b=a-1;
            while (b>=0&&someNums[b]>temp){
                someNums[b+1]=someNums[b];
                --b;
            }
            someNums[b+1]=temp;
            ++a;
        }
        for (int someNum:someNums)
            System.out.println(someNum+" ");
    }
}
