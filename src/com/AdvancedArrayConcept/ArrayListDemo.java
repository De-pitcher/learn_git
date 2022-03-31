package com.AdvancedArrayConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList names=new ArrayList();
        names.add("Abigil");
        display(names);
        names.add("Brian");
        display(names);
        names.add("Zachary");
        display(names);
        names.add(2, "Christy");
        display(names);
        names.remove(1);
        display(names);
        names.set(0, "Annette");
        display(names);
    }
    public static void display(ArrayList names){
        System.out.println("\nThe size of the list is " +
                names.size());
        for (int x=0;x<names.size();++x)
            System.out.println("Position "+x+" Name: "+
                    names.get(x));
    }
}
