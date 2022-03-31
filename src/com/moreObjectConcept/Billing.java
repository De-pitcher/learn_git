package com.moreObjectConcept;

public class Billing {
    double price;
    int quant;
    int coup;
    public double computeBill(double price){
        this.price=price;
        double tax=price*0.8;
        double totalDue=price+tax;
        return totalDue;
    }
    public double computeBill(double price,int quant){
        this.price=price;
        this.quant=quant;
        double tax=price*0.8;
        double totalDue=price*quant;
        totalDue=totalDue+tax;
        return totalDue;
    }
    public double computeBill(double price,int quant,int coup){
        this.price=price;
        this.quant=quant;
        this.coup=coup;
        double tax=price*0.8;
        double totalDue=price*quant;
        totalDue=totalDue-coup;
        totalDue=totalDue+tax;
        return totalDue;
    }

    public static void main(String[] args) {
        Billing obj=new Billing();
        double a1=obj.computeBill(10);
        double a2=obj.computeBill(10,3);
        double a3=obj.computeBill(11,5,5);
        System.out.println("Total price is: "+a1);
        System.out.println("Total price is: "+a2);
        System.out.println("Total price is: "+a3);
    }
}
