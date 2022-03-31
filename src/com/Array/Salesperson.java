package com.Array;

import java.util.Comparator;

public class Salesperson implements Comparable<Salesperson>{
    int ID;
    double annualSal;

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setAnnualSal(double annualSal) {
        this.annualSal = annualSal;
    }

    public double getAnnualSal() {
        return annualSal;
    }


    @Override
    public int compareTo(Salesperson id) {
        int compareID=((Salesperson)id).getID();
        return id.ID-compareID;
    }
}
