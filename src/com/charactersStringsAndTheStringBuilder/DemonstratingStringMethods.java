package com.charactersStringsAndTheStringBuilder;

public class DemonstratingStringMethods {
    public static void main(String[] args) {
        String str="You can never cross the ocean until you the courage to" +
                "lose sight of the shore.";
        System.out.println(str.indexOf('v'));
        System.out.println(str.indexOf('x'));
        System.out.println(str.charAt(16));
        System.out.println(str.endsWith("bus"));
        System.out.println(str.endsWith("car"));
        System.out.println(str.replace('c','C'));
    }
}
