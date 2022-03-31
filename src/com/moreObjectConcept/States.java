package com.moreObjectConcept;

public class States {
    String nameOfState;
    int population;
    String capCity;
    String popCity;
    public States(String name,int pop,String cCity,String pCity){
        nameOfState=name;
        population=pop;
        capCity=cCity;
        popCity=pCity;
    }

    public String getNameOfState() {
        return nameOfState;
    }

    public int getPopulation() {
        return population;
    }

    public String getCapCity() {
        return capCity;
    }

    public String getPopCity() {
        return popCity;
    }
}
