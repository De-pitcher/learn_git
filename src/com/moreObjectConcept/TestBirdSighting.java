package com.moreObjectConcept;

public class TestBirdSighting {
    public static void main(String[] args) {
        BirdSighting bird=new BirdSighting();
        System.out.println("The bird sighting result is: "+
                "\n"+bird.getBirdSpecies()+"\n"+ bird.getNumberSeen()+
       "\n"+ bird.getDayOfTheYear());

    }
}
