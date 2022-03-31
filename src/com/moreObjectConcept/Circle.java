package com.moreObjectConcept;

public class Circle {
    double radius;
    double diameter;
    double area;

    public Circle(double radius) {
        radius = 1;
        diameter = Math.sqrt(radius);
        area = Math.PI * Math.sqrt(radius);
    }

    public void setRadius() {
        this.radius = radius;
        this.diameter = diameter;
        this.area = area;
    }

    public void getRadius(double radius) {
        System.out.println("Radius of the circle is: " + radius);
        System.out.println("Diameter of the circle is: " + diameter);
        System.out.println("Area of the circle is: " + area);

    }
}