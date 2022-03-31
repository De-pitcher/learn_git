package com.moreObjectConcept;

public class DiceGame {
    int randomValue;
    public DiceGame(){
        randomValue=((int)(Math.random()*100)%6+1);
    }
    public void getValue(){
        System.out.println(randomValue);
    }
}
