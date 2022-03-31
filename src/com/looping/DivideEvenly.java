package com.looping;

public class DivideEvenly {
    public static void main(String[] args) {
        final int LIMIT=100;
        int var;
        System.out.println(LIMIT+" is divisible by ");
        for(var=1;var<LIMIT;++var)
            if(LIMIT%var==0)
                System.out.print(var+" ");
            //Display empty space
            System.out.println();
    }
}
