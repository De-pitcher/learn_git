package com.Array;

public class NumberListDemo {
    public static void main(String[] args) {
        int[] integers= {11,2,3,4,5,6,7,8};
        int total=0;
        double avg;
        int x;
        int max=integers[0];
        int min=integers[0];
        int count=0;
        for (x=0;x<integers.length;++x)
            System.out.println(integers[x]);
        System.out.println("The inverse is: q");
        for (x=integers.length-1;x>=0;x--)
            System.out.println(integers[x]);
        for (x=0;x<integers.length;++x){
            total+=integers[x];
        }
        System.out.println("The total is "+total);
        while (count<4) {
            System.out.println(integers[count]);
            count++;
        }
        for (x=0;x<integers.length;++x){
            if (integers[x]<min){
                min=integers[x];
            }
        }
        System.out.println("The lowest integer" +
                " is "+min);
        for (x=0;x<integers.length;++x){
            if (integers[x]>max)
                max=integers[x];
        }
        System.out.println("The largest integer is "
                +max);
        avg=total/integers.length;
        System.out.println("The average of " +
                " the integers is "+avg);
        System.out.println("Integers higher than " +
                "the average is ");
        for (x=0;x<integers.length;++x){
            if (integers[x]>avg)
            System.out.println(integers[x]);
        }
    }
}
