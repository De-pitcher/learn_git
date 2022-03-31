package com.looping;

public class Knot {
    public static void main(String[] args) {
        double knot;
        double kiloMeters=1.852;
        double miles=1.151;
        knot=14;
        while(knot<30){
            ++knot;
            kiloMeters=knot*kiloMeters;
            miles=knot*miles;
            System.out.println(knot+" knots is "+kiloMeters+" km in kilometers");
            System.out.println(knot+" knots is "+miles+" m in miles");

        }
    }
}
