package com.charactersStringsAndTheStringBuilder;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        String aName="Carmen";
        String anotherName;
        Scanner input=new Scanner(System.in);
        anotherName=input.nextLine();
        if(aName.equals(anotherName))
            System.out.println(aName+" equals "+anotherName);
        else
            System.out.println(aName+" does not equals "+anotherName);
    }
}
