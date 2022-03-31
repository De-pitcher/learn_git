package com.charactersStringsAndTheStringBuilder;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String passCode,passCodeCheck;
        int stringLength;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter password: ");
        passCode=input.nextLine();
        stringLength=passCode.length();
        while (!(passCode.matches(".*[0-9]{1,}.*")
                &&passCode.matches(".*[a-zA-Z]{1,}.*")
                &&stringLength>=6&&stringLength<=10)){
        System.out.println("Password is not acceptable try again: ");
                passCode=input.nextLine();
            }
        System.out.println("Confirm password: ");
        passCodeCheck=input.nextLine();
        while (!(passCode.equals(passCodeCheck))){
            System.out.println("Wrong! try again: ");
            passCodeCheck=input.nextLine();
        }System.out.println("Passed!");
        }
    }

