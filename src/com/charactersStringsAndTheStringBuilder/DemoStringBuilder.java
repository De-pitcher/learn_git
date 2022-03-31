package com.charactersStringsAndTheStringBuilder;

public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("singing");
        print(str);
        str.append(" in the dead of ");
        str.insert(0,"Black");
        print(str);
        str.insert(5,"bird ");
        print(str);
        str.append(" night");
        print(str);
        String str1="Ebuka";
        String str2="Ebukb";
        boolean a1=str1.equals("Ebuka");
        System.out.println(a1);
        int a2=str1.compareTo(str2);
        System.out.println(a2);
    }
    public static void print(StringBuilder s){
        System.out.println(s);
    }
}
