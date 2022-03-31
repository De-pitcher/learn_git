package com.charactersStringsAndTheStringBuilder;

public class CountMatch2 {
    public static void main(String[] args) {
        String str1="erebak",str2="aberak";
        printCommon(str1,str2);
    }
    public static String getString(char x) {
        String s = String.valueOf(x);
        return s;
    }
    public static void printCommon(String s1,String s2){
        char num1;
        char num2;
        String strLength=s1+" "+s2;
        int length1=s1.length();
        int length2=s2.length();
        for (int i=0;i<length1;i++) {
            num1 = (s1.charAt(i));
            System.out.println(" "+num1);
        }
        for (int i=0;i<length2;i++) {
            num2 = (s2.charAt(i));
            System.out.println(" "+num2);;
        }
        /*for (int i=0;i<strLength.length();i++){
            if (num1!=0&&num2!=0){
                for (int j=0;j<Math.min(s1.length(),s2.length());j++)
                System.out.println((char) (i+'a'));
            }*/
        }
    }

