package com.charactersStringsAndTheStringBuilder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountMatch3 {
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner input=new Scanner(System.in);
        System.out.println("Input first string >>");
        s1=input.nextLine();
        System.out.println("Input second string>>");
        s2=input.nextLine();
        Set<Character> set1=new HashSet<Character>();
        Set<Character> set2=new HashSet<Character>();
        for (char c:s1.toCharArray()){
            set1.add(c);
        }
        for (char c:s2.toCharArray()){
            set2.add(c);
        }
        set1.retainAll(set2);
        for (char c:set1){
            System.out.println(" "+c);
        }
        System.out.println("\nTotal number of common characters is "+set1.size());
    }
}
