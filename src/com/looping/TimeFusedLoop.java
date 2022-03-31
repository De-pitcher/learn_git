package com.looping;

public class TimeFusedLoop {
    public static void main(String[] args) {
        long startTime1,startTime2,endTime1,endTime2;
        final int REPEAT=10000;
        startTime1=System.currentTimeMillis();
        for (int x=REPEAT;x>=0;--x)
            method1(REPEAT);
        for (int x=REPEAT;x>=0;--x)
            method2(REPEAT);
        endTime1=System.currentTimeMillis();
        System.out.println("Time for loops starting from 0: "+
                (endTime1-startTime1)+" milliseconds");
        startTime2=System.currentTimeMillis();
        for(int x=REPEAT;x>=0;--x){
            method1(REPEAT);
            method2(REPEAT);
        }
        endTime2=System.currentTimeMillis();
        System.out.println("Time for loops ending at 0: "+
                (endTime2-startTime2)+" milliseconds");
    }
    public static void method1(final int REPEAT){
        for(int x=REPEAT;x>=0;--x);
    }
    public static void method2(final int REPEAT){
        for(int x=REPEAT;x>=0;--x);
    }
}
