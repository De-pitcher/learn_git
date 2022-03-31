package com.AdvancedArrayConcept;

public class Service {
    String description;
    double price;
    int minutes;
    public Service(String desc,double pr,int mins){
        this.description=desc;
        this.price=pr;
        this.minutes=mins;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
