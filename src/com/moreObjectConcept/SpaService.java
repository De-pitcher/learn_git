package com.moreObjectConcept;

public class SpaService {
    String serviceDescription;
    double price;
    public SpaService(){
        serviceDescription="XXX";
        price=0;
    }

    public void setServiceDescription(String service) {
        serviceDescription=service;
    }

    public void setPrice(double pr) {
        price=pr;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public double getPrice() {
        return price;
    }
}
