package com.charactersStringsAndTheStringBuilder;

import java.util.Scanner;

public class ConstructID {
    public static void main(String[] args) {
        String fName,lName,sName,fullNameAndID,lAc,originalName;
        int sAdd;
        int i,x;
        char c1,c2,c3;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name: ");
        fullNameAndID=input.nextLine();
        System.out.println("Enter your street address: ");
        sAdd=input.nextInt();
        originalName=fullNameAndID;
        int length=fullNameAndID.length();
        for (i=0;i<fullNameAndID.length();i++){
            if (fullNameAndID.charAt(i)==' '){
                ++i;
                c2=fullNameAndID.charAt(i);
                c2=Character.toUpperCase(c2);
                c1=fullNameAndID.charAt(0);
                c1=Character.toUpperCase(c1);
                lAc=c2+fullNameAndID.substring(i+1,length);
                x=lAc.indexOf(' ');
                c3=lAc.charAt(x+1);
                c3=Character.toUpperCase(c3);
                fullNameAndID=c1+String.valueOf(c2)+c3;
            }
        }
        System.out.println("The user "+originalName
        +" who lives at "+sAdd+" would have an ID of "+fullNameAndID+sAdd);
    }
}
