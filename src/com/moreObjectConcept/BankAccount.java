package com.moreObjectConcept;

public class BankAccount {
    String accountName;
    int accountNumber;
    double accountBalance;
    public BankAccount(){
        accountName="Nnamdi Eze";
        accountNumber=1234567890;
        accountBalance=35000;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public void deductMonthlyFee(){
        double VAT=accountBalance-4;
        System.out.println(VAT);
    }
    public static void explainAccountPolicy(){
        System.out.println("Service fee of $4 will be deducted from " +
                "your account monthly");
    }
}
