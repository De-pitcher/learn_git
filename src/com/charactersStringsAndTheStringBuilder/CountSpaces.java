package com.charactersStringsAndTheStringBuilder;

public class CountSpaces {
    public static void main(String[] args) {
        String str="The person who says something is impossible" +
                " should not interrupt the person who is doing it";
        int x=0;
        int y=0;
        while(x<str.length()){
            if(str.charAt(x)==' ') {
                ++y;
            }
            ++x;
        }
        System.out.println("The total number of spaces is "+y);
    }
}
