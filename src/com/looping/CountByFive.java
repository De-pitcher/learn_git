package com.looping;

public class CountByFive {
    public static void main(String[] args) {
        final int LIMIT=200;
        int var;
      for(var=0;var<=LIMIT;var+=5){
            System.out.print(var+" ");
      if(var==50||var==100||var==150) {
          //Display the number and a space
          System.out.println();
        }
      }
    }
}
