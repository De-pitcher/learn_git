package com.decisionMaking;

public class TwoCharacters {
    public static void main(String[] args) {
        MyCharacter obj1=new MyCharacter();
        MyCharacter obj2=new MyCharacter();
        obj1.setName("Thor");
        obj1.setColour("Blue");
        obj1.setNumOfLives(10);
        obj2.setName("Super Man");
        obj2.setColour("Red");
        obj2.setNumOfLives(10);
        display(obj1);
        display(obj2);

    }
    public static void display(MyCharacter character){
        System.out.println("Name of the character is "
                +character.getName());
        System.out.println("Colour of the character is "
                +character.getColour());
        System.out.println("The lives of the character is "
                +character.getNumOfLives());

    }
}
