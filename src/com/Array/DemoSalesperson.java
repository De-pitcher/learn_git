package com.Array;

public class DemoSalesperson {
    public static void main(String[] args) {
        final int NUM_SALESPERSON=10;
        //Salesperson salesperson=new Salesperson(get);
        Salesperson[] obj=new Salesperson[NUM_SALESPERSON];
        int x;
        System.out.println("ID number and salary");
        for (x=0;x<NUM_SALESPERSON;++x){
            obj[x]=new Salesperson();
            obj[x].setID(9999);
            obj[x].setAnnualSal(0.0);
            System.out.println(obj[x].getID()+"      " +
                    "    $"+
                    obj[x].getAnnualSal());
        }

    }
}
