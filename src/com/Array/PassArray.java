package com.Array;

public class PassArray {
    public static void main(String[] args) {
        final int NUM_ELEMENTS=4;
        int[] someNums={5,10,15,20};
        int x;
        System.out.println("At the start of main: ");
        for (x=0;x<NUM_ELEMENTS;++x)
            System.out.println(" "+someNums[x]);
        System.out.println();
        methodGetsArray(someNums);
        System.out.println("At the end of main: ");
        for (x=0;x<NUM_ELEMENTS;++x)
            System.out.println(" "+someNums[x]);
        System.out.println();
    }
    public static void methodGetsArray(int[] arr){
        int x;
        System.out.println("At the start of method arr holds: ");
        for (x=0;x< arr.length;++x)
            System.out.println(" "+arr[x]);
        System.out.println();
        for (x=0;x<arr.length;++x)
            arr[x]=888;
        System.out.println(" and at the end of method holds: ");
        for (x=0;x<arr.length;++x)
            System.out.println(" "+arr[x]);
        System.out.println();
    }
}
