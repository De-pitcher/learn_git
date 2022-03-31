package com.charactersStringsAndTheStringBuilder;

import java.util.Scanner;

public class FiveLettersAndFiveDigit {
    public static void main(String[] args) {
        String fiveLetters;
        int fiveDigit;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input atleast five letters >>");
        fiveLetters = keyboard.nextLine();
            while (fiveLetters.length() < 5) {
                System.out.println("The letter is not enough");
                System.out.println("Try again >>");
                fiveLetters = keyboard.nextLine();
            }
        System.out.println("Input atleast five digits");
        fiveDigit = keyboard.nextInt();
        while (Integer.toString(fiveDigit).length() < 5) {
                System.out.println("The digit is not enough");
                System.out.println("Try again >>");
                fiveDigit = keyboard.nextInt();
            }
        System.out.println("Successful!");
    }
}
