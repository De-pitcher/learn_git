package com.charactersStringsAndTheStringBuilder;

import java.io.IOException;
import java.util.Scanner;

public class CountMatch1 {
    static final int MAX_CHAR=26;
    static void printCommon(String s1,String s2){
        int[]a1=new int [MAX_CHAR];
        int[]a2=new int[MAX_CHAR];
        int length1=s1.length();
        int length2=s2.length();
        for (int i=0;i<length1;i++)
            a1[s1.charAt(i)-'a']+=1;
        for (int i=0;i<length2;i++)
            a2[s2.charAt(i)-'a']+=1;
        for (int i=0;i<MAX_CHAR;i++){
            if (a1[i]!=0&&a2[i]!=0){
                for (int j=0;j<Math.min(a1[i],a2[i]);j++)
                    System.out.println(((char) (i+'a')));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        //Scanner input=new Scanner(System.in);
        String s1="Amphibiakmbhj",s2="Geraffjbghifcghj";
        /*System.out.println("Enter a string >>");
        s1=input.nextLine();
        System.out.println("Enter another string >>");
        s2=input.nextLine();*/
        printCommon(s1,s2);
    }
}
