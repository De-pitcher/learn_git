package com.looping;

import java.util.Scanner;

public class EvenEntry {
    public static void main(String[] args) {
        int number=2;
        int enterNum;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an even number > ");
        enterNum=input.nextInt();
        while (enterNum!=999){
            if(enterNum%number==0){
                System.out.println("Good job! ");
                System.out.print("Enter another number > ");
            enterNum=input.nextInt();
        }else if(enterNum%number==1){
                System.out.print("Error! Type in even number > ");
                enterNum=input.nextInt();
            }
        }
    }
}
