package com.moreObjectConcept;

public class BloodData {
    String bloodTypeA,bloodTypeB,bloodTypeAB,bloodTypeO;
    String RhFactor1;
    String RhFactor2="-";
    public void bloodData(String bloodTypeO){
        bloodTypeO="O";
        RhFactor1="O+";

    }
    public void bloodData(String bloodTypeO, String RhFactor1){
        this.bloodTypeO=bloodTypeO;
        this.RhFactor1=RhFactor1;
    }

    public String getBloodTypeO() {
        return bloodTypeO;
    }

    public String getRhFactor1() {
        return RhFactor1;
    }

    public void setBloodTypeO() {
        bloodTypeO="O";
    }

    public void setRhFactor1() {
        RhFactor1="O+";
    }
}
