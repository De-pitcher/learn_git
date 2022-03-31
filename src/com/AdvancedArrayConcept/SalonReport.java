package com.AdvancedArrayConcept;

import java.util.Scanner;

public class SalonReport {
    public static void main(String[] args) {
        Service[] obj=new Service[6];
        int choose;
        obj[0]=new Service("Cut",8.0,15);
        obj[1]=new Service("Shampoo",4.00,10);
        obj[2]=new Service("Manicure",18.00,30);
        obj[3]=new Service("Style",48.00,50);
        obj[4]=new Service("Permanent",18.0,35);
        obj[5]=new Service("Trim",6.0,5);
        Scanner input=new Scanner(System.in);
        System.out.println("Choose the preferred sorting order:");
        System.out.println("1 to sort by name \n2 by price\n3" +
                " by time \n>>");
        choose=input.nextInt();
        if (choose==1){
            sort(obj);
            for (Service s:obj) {
                System.out.println(" "+s.getDescription()+
                        " "+s.getPrice()+" "+s.getMinutes());
            }
        }else if (choose==2){
            sort(obj,0.0);
            for (Service s:obj) {
                System.out.println(" "+s.getDescription()+
                        " "+s.getPrice()+" "+s.getMinutes());
            }
        }else if (choose==3){
            sort(obj,0);
            for (Service s:obj) {
                System.out.println(" "+s.getDescription()+
                        " "+s.getPrice()+" "+s.getMinutes());
            }
        }
    }
    public static void sort(Service[] s){
        String temp;
        int c,comparisonToMake=s.length-1;
        for (int i=0;i< s.length-1;++i){
            for (int j=0;j<comparisonToMake;++j){
            c=s[j].getDescription().compareTo(s[j+1].getDescription());
                if (c>0){
                    temp=s[j].getDescription();
                    s[j].setDescription(s[j+1].getDescription());
                    s[j+1].setDescription(temp);
                }
            }--comparisonToMake;
        }
    }public static void sort(Service[] s,double pr){
        int comparisonToMake=s.length-1;
        for (int i=0;i< s.length-1;++i){
            for (int j=0;j<comparisonToMake;++j){
                if (s[j].getPrice()>s[j+1].getPrice()){
                    pr=s[j].getPrice();
                    s[j].setPrice(s[j+1].getPrice());
                    s[j+1].setPrice(pr);
                }
            }--comparisonToMake;
        }
    }public static void sort(Service[] s,int mins){
        int comparisonToMake=s.length-1;
        for (int i=0;i< s.length-1;++i){
            for (int j=0;j<comparisonToMake;++j){
                if (s[j].getMinutes()>s[j+1].getMinutes()){
                    mins=s[j].getMinutes();
                    s[j].setMinutes(s[j+1].getMinutes());
                    s[j+1].setMinutes(mins);
                }
            }--comparisonToMake;
        }
    }
}
