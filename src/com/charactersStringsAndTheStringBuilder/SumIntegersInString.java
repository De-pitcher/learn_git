package com.charactersStringsAndTheStringBuilder;

import java.util.Scanner;

public class SumIntegersInString {
    public static void main(String[] args) {
        String str,str1,str2;
        int i,num1,num2,num3,num4,sum=0;
        Scanner input=new Scanner(System.in);
        str=input.nextLine();
        for (String value:str.split(" ")){
            System.out.println(value+" ");
            sum+=Integer.parseInt(value);
        }
        System.out.println(sum);
    }
}
