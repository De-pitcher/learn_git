package com.charactersStringsAndTheStringBuilder;


import java.util.Scanner;

public class CountMatch {
    public static void main(String[] args) {
        String firstName;
        String secondName;
        Scanner input=new Scanner(System.in);
        firstName=input.next();
        secondName=input.next();
        if (solve(firstName,secondName)) {
            System.out.println("Yes!");
        }
        else
            System.out.println("No!");
    }
    public static String getString(char x){
        String s=String.valueOf(x);
        return s;
    }
    public static boolean solve(String s1,String s2){
        String a=getString(s1.charAt(0));
        String b=getString(s2.charAt(0));
        for (int i=1;i<s1.length();i++)
            if (s1.charAt(i)!=s1.charAt(i-1)){
                a +=getString(s1.charAt(i));
            }
        for (int i=1;i<s2.length();i++)
            if (s2.charAt(i)!=s2.charAt(i-1)){
                b+=getString(s2.charAt(i));
            }
        if (a.equals(b))
            return true;
        else
        return false;
    }
}
