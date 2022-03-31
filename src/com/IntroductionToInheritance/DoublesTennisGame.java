package com.IntroductionToInheritance;

public class DoublesTennisGame extends TennisGame{
    String player2,sPlayer2;

    public String getSPlayer2() {
        return player2;
    }

    public String getsPlayer2() {
        return sPlayer2;
    }

    public void setPlayer(String ply1, String sPly1,String ply2,String sPly2) {
        super.setPlayer(ply1, sPly1);
        this.player2=ply2;
        this.sPlayer2=sPly2;
    }
}
