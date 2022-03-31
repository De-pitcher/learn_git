package com.IntroductionToInheritance;

public class DemoCandle {
    public static void main(String[] args) {
        Candle candle=new Candle();
        ScentedCandle scentedCandle=new ScentedCandle();
        candle.setColor("Red");
        candle.setHeight(5);
        System.out.println(candle.getColor()+" "+candle.getHeight()
        +"cm $"+candle.getPrice()+" per inch");
        scentedCandle.setColor("Green");
        scentedCandle.setHeight(7);
        scentedCandle.setScent("Cool breeze");
        System.out.println(scentedCandle.getColor()+" "
            +scentedCandle.getScent()+" "+scentedCandle.getHeight()
                +"cm $"+candle.getPrice()+" per inch");
    }
}
