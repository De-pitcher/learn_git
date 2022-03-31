package com.AdvancedArrayConcept;

public class BubbleSort1 {
    public static void main(String[] args) {
     int[] someNums={88,33,99,22,54};
     int temp;
     int comparisonsToMake=someNums.length-1;
     for (int a=0;a<someNums.length-1;++a){
         for (int b=0;b<comparisonsToMake;++b){
             if (someNums[b]>someNums[b+1]){
                 temp=someNums[b];
                 someNums[b]=someNums[b+1];
                 someNums[b+1]=temp;
             }
         }
         --comparisonsToMake;
     }
        for (int someNum : someNums) System.out.println(" " + someNum);
    }
}
