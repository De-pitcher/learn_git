package com.charactersStringsAndTheStringBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountMatch4 {
    static char num1,c;
     static char num2,d;
    static char add(char ch){
        return ch;
    }
    static void display() {
        if (c==d)
            System.out.println(c);
    }
    public static void main(String[] args) {
        String s1,s2;
        List<Character> characters=new ArrayList<>();
        List<Character> characters2=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        s1=input.nextLine();
        s2=input.nextLine();
        for (char c:characters)
            System.out.println(" "+c);
        //display();
        int length1=s1.length();
        int length2=s2.length();
        for (int i=0;i<length1;i++) {
            for (char c1:s1.toCharArray())
                characters.add(c1);
            //c = (s1.charAt(i));
            //add(c);
        }
        for (int i=0;i<length2;i++) {
            for (char c2:s1.toCharArray())
                characters2.add(c2);
            //d= (s2.charAt(i));
            //add(d);
        }


        /*for (int i=0;i<strLength.length();i++){
            if (num1!=0&&num2!=0){
                for (int j=0;j<Math.min(s1.length(),s2.length());j++)
                    System.out.println((char) (i+'a'));
            }*/
        }
    }

