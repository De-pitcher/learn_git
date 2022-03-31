package com.Array;

public class EightInt {
    public static void main(String[] args) {
        int[] ints={1,2,3,4,5,6,7,8};
        int length= ints.length;
        int x;
        for (x=0;x<length;++x)
            System.out.println(" "+ints[x]);
        System.out.println();
        for (x=length-1;x>=0;x--)
            System.out.println(" "+ints[x]);
    }
}
