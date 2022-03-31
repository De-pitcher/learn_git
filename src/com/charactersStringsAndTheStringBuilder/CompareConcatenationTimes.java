package com.charactersStringsAndTheStringBuilder;

public class CompareConcatenationTimes {
    public static void main(String[] args) {
        long startTimes1,startTimes2,endTime1,endTime2;
        final int TIMES=200000;
        int x;
        StringBuilder string1=new StringBuilder("");
        StringBuilder string2=new StringBuilder(TIMES*4);
        startTimes1=System.currentTimeMillis();
        for(x=0;x<TIMES;++x)
            string1.append("Java");
        endTime1=System.currentTimeMillis();
        System.out.println("Time for empty stringBuilder : "+
                (endTime1-startTimes1)+" milliseconds");
        startTimes2=System.currentTimeMillis();
        for(x=0;x<TIMES;++x)
            string2.append("Java");
        endTime2=System.currentTimeMillis();
        System.out.println("Time for large stringBuilder : "+
                (endTime2-startTimes2)+" milliseconds");
    }
}
