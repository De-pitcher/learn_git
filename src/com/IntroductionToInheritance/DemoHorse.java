package com.IntroductionToInheritance;

public class DemoHorse {
    public static void main(String[] args) {
        RaceHorse raceHorse=new RaceHorse();
        raceHorse.setNumRace(1);
        raceHorse.setBirthYear(2021);
        raceHorse.setColor("Red");
        raceHorse.setName("Cheater");
        System.out.println(raceHorse.getNumRace()+" "+ raceHorse.getBirthYear()+
                " "+raceHorse.getName()+" "+raceHorse.getColor());

    }
}
