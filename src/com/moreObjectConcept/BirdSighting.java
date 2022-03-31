package com.moreObjectConcept;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BirdSighting {
    String birdSpecies;
    int numberSeen;
    int dayOfTheYear;
    public BirdSighting(){
        birdSpecies="robin";
        numberSeen=1;
        GregorianCalendar day=new GregorianCalendar();
        dayOfTheYear=day.get(GregorianCalendar.DAY_OF_YEAR);
    }
    public String getBirdSpecies() {
        return birdSpecies;
    }

    public int getNumberSeen() {
        return numberSeen;
    }

    public int getDayOfTheYear() {
        return dayOfTheYear;
    }

}
