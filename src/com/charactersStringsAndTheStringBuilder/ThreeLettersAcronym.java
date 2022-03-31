package com.charactersStringsAndTheStringBuilder;

import javax.swing.*;

public class ThreeLettersAcronym {
    public static void main(String[] args) {
        String name,nam,saveOriginalName;
        int stringLength;
        int i,x;
        char c,c1,c2,c3;
        name= JOptionPane.showInputDialog(null,
                "Please enter three words");
        saveOriginalName=name;
        stringLength=name.length();
        for(i=0;i<name.length();++i){
            if(name.charAt(i)==' '){
                ++i;
                c=name.charAt(i);
                c=Character.toUpperCase(c);
                c1=name.charAt(0);
                c1=Character.toUpperCase(c1);
                c2=c;
                nam=c+name.substring(i+1,stringLength);
                x=nam.indexOf(' ');
                c3=nam.charAt(x+1);
                c3=Character.toUpperCase(c3);
                name= c1 +String.valueOf(c2)+ c3;
            }
        }
        JOptionPane.showMessageDialog(null,"Original phrase was "+
                saveOriginalName+"\nThree letter acronym is "+name);
    }
}
