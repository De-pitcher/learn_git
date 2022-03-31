package com.looping;

public class Factorials {
    public static void main(String[] args) {
        int i, fact = 1;
        int number = 10;
        for (i = 1; i < number; i++) {
            ++i;
            fact = fact * i;
        }
        System.out.println("The factorial of " + number + " is " + fact);
    }
}
