package com.moreObjectConcept;

public class TestState {
    public static void main(String[] args) {
        States s1=new States("Anambra",7500000,"Awka","Onitsha");
        getData(s1);
    }
    public static void getData(States s){
        System.out.println(s.getNameOfState()+
        "\n"+s.getPopulation()+
        "\n"+s.getCapCity()+
        "\n"+s.getPopCity());

    }
}
