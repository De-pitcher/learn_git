package com.decisionMaking;

import java.util.GregorianCalendar;

public class Invoice {
    int invoiceNumber;
    double balanceDue;
    int month;
    int day;
    int year;
    public Invoice(int num,double balDue,int mon,
                   int dy,int yr){
        invoiceNumber=num;
        balanceDue=balDue;
        month=mon;
        day=dy;
        year=yr;
        if(num<1000)
            num=0;
        if (mon<1||mon>12)
            mon=0;
        if(dy<1||dy>31)
            dy=0;
        if(yr<2011||yr>2017)
            yr=0;
    }
    public void display(){
        System.out.println(invoiceNumber);
        System.out.println(balanceDue);
        System.out.println(month);
        System.out.println(day);
        System.out.println(year);
    }
}
