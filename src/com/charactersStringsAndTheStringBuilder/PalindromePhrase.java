package com.charactersStringsAndTheStringBuilder;

import java.util.Scanner;

public class PalindromePhrase {
    //To check if sentence is palindrome or not
    static boolean sentencePalindrome(String str){
        int j=0;
        int i=str.length()-1;
        //Lowercase string
        str=str.toLowerCase();
        //Compare whether they are equal
        while (j<=i){
            char getAtj=str.charAt(j);
            char getAti=str.charAt(i);
            //If there is another symbol in left of sentence
            if (!(getAtj>='a'&&getAtj<='z'))
                j++;
            //If there is another symbol in right of sentence
            else if (!(getAti>='a'&&getAti<='z'))
                i--;
            //If characters are equal
            else if (getAtj==getAti){
                j++;
                i--;
            }
            //If characters are not equal then sentence is not palindrome
            else
                return false;
        }
        //Return true if sentence is palindrome
        return true;
    }

    public static void main(String[] args) {
        String str1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        str1=input.nextLine();
        if (sentencePalindrome(str1))
            System.out.println("Sentence is palindrome");
        else
            System.out.println("Sentence is not palindrome");
    }
}
