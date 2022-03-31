package com.looping;

public class Purchase {
    int invoiceNum;
    double salAmt;
    double taxSalAmt;

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public void setSalAmt(double salAmt) {
        this.salAmt = salAmt;
    }

    public void setTaxSalAmt(double taxSalAmt) {
        this.taxSalAmt = taxSalAmt;
        taxSalAmt=salAmt*0.05;
    }
    public void display(){
        System.out.println("Invoice number is "+invoiceNum);
        System.out.println("Amount of sales is $"+salAmt);
        System.out.println("Amount of sales of tax is $"+taxSalAmt);
    }
}
