package com.charactersStringsAndTheStringBuilder;

public class TaxReturn {
    int zipCode;
    String sosSecNum=("###-###-####");
    String lName,fName,strAdd,city,state;

    char marStatus;
    double annIncome,taxLiability;
    public TaxReturn(){
        if (getAnnIncome()>0&&getAnnIncome()<=20000&&(getMarStatus()=='s'||getMarStatus()=='S'))
            taxLiability=getAnnIncome()*0.15;
        else if (getAnnIncome()>0&&getAnnIncome()<=20000&&(getMarStatus()=='m'||getMarStatus()=='M'))
            taxLiability=getAnnIncome()*0.14;
        else if (getAnnIncome()>=20001&&getAnnIncome()<=50000&&(getMarStatus()=='s'||getMarStatus()=='S'))
            taxLiability=getAnnIncome()*0.22;
        else if (getAnnIncome()>=20001&&getAnnIncome()<=50000&&(getMarStatus()=='m'||getMarStatus()=='M'))
            taxLiability=getAnnIncome()*0.20;
        else if (getAnnIncome()>=50001&&(getMarStatus()=='s'||getMarStatus()=='S'))
            taxLiability=getAnnIncome()*0.30;
        else
            taxLiability=getAnnIncome()*0.28;
    }

    public void setSosSecNum(String sosSecNum) {
        this.sosSecNum = sosSecNum;
    }

    public String getSosSecNum() {
        return sosSecNum;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlName() {
        return lName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfName() {
        return fName;
    }

    public void setStrAdd(String strAdd) {
        this.strAdd = strAdd;
    }

    public String getStrAdd() {
        return strAdd;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setMarStatus(char marStatus) {
        this.marStatus = marStatus;
    }

    public char getMarStatus() {
        return marStatus;
    }

    public void setAnnIncome(double annIncome) {
        this.annIncome = annIncome;
    }

    public double getAnnIncome() {
        return annIncome;
    }

    public void setTaxLiability(double taxLiability) {
        this.taxLiability = taxLiability;
    }

    public double getTaxLiability() {
        return taxLiability;
    }

    public void display(){
        System.out.println("#"+getSosSecNum()+" "+getlName()+" "+getfName()+
            " \nwhose address is "+getStrAdd()+" of "+getCity()
                +","+getState()+" "+getZipCode()
        +"who is "+getMarStatus()+" has an annual income of $"+getAnnIncome()+". " +
                "\nThe tax liability based on annual income is $"+getTaxLiability());
    }
}
