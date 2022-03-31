package com.Array;

import java.util.Scanner;

public class FlexibleQuizAverage {
    public static void main(String[] args) {
        int[] scores=new int[10];
        int score=0;
        int count=0;
        int total=0;
        final int QUIT=999;
        final int MAX=10;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter quiz score >> ");
        score=input.nextInt();
        while (count<MAX&&score!=QUIT){
            if (score!=QUIT){
                scores[count]=score;
                total+=scores[count];
                System.out.println("Enter next quiz score or " +
                        QUIT+" to quit >> ");
                score=input.nextInt();
            }
            count++;
        }
        System.out.println("The score entered were:");
        for (int x=0;x<count;++x)
            System.out.println(scores[x]+" ");
        System.out.println("\nThe average is "+(total*1.0/count));
    }
}
