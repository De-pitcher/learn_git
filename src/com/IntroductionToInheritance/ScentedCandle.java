package com.IntroductionToInheritance;

public class ScentedCandle extends Candle{
    String scent;

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        price=3.0;
    }
}
