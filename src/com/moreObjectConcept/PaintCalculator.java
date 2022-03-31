package com.moreObjectConcept;

public class PaintCalculator {
    int area;
    public static void main(String[] args) {
        PaintCalculator obj=new PaintCalculator();
        obj.calculateArea(50,20,30);
        obj.calculatePrice();
    }
    public void calculateArea(int length,int width,int height){
        int areaOfSquareFoot=length*height;
        int areaOfRectangularFoot=height*width;
        area=areaOfRectangularFoot+areaOfSquareFoot;
        System.out.println("The area of the room is: "+area+"meters");
    }
    public void calculatePrice(){
        int gallon=32;
        area=gallon+gallon;
        int price=area;
        System.out.println("The number of gallon needed" +
                " for the whole room is 2 ");
        System.out.println("And the price is: $"+price);;

    }
}
