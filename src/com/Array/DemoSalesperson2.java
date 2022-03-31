package com.Array;

public class DemoSalesperson2 {
    public static void main(String[] args) {
        final int NUM_SALESPERSON=10;
        Salesperson[] obj=new Salesperson[NUM_SALESPERSON];
        int x;
        int i=111;
        int j=25000;
        System.out.println("ID number and salary");
        for (x=0;x<NUM_SALESPERSON;++x){
            obj[x]=new Salesperson();

        }

                for (x=0;x<NUM_SALESPERSON;++x) {
                    obj[x].setID(i);
                    i++;
                }
                for (x=0;x<NUM_SALESPERSON;++x) {
                    obj[x].setAnnualSal(j);
                j += 5000;
            }
        for (x=0;x<NUM_SALESPERSON;++x) {
            System.out.println(obj[x].getID() + "      " +
                    "    $" +
                    obj[x].getAnnualSal());
        }
    }
}

