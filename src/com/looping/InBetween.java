package com.looping;

import java.util.Scanner;

public class InBetween {
    public static void main(String[] args) {
        int firstNum, secondNum;
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Input 1st integer > ");
        firstNum = input.nextInt();
        System.out.print("Input second integer > ");
        secondNum = input.nextInt();
        if (firstNum==secondNum) {
            System.out.println("There is no integers between them ");
        }
        for (i = ++firstNum; i < secondNum; ++i) {
                System.out.print(i + " ");
                System.out.println();
            }
        }
    }
