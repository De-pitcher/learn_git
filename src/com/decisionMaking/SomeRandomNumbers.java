package com.decisionMaking;

import java.util.Random;

public class SomeRandomNumbers {
    public static void main(String[] args) {
        Random ran =new Random();
        final int LIMIT=10;
        System.out.println(ran.nextInt(LIMIT)+" "
                +ran.nextInt(LIMIT)+" "
        +ran.nextInt(LIMIT));
    }
}
