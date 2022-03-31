package com.IntroductionToInheritance;

public class TennisGame {
    String player1,player2;
    int fScoreForPly1,fScoreForPly2;
    String fScoreP1,fScoreP2;

    public int getFScoreForPly1() {
        return fScoreForPly1;
    }

    public int getFScoreForPly2() {
        return fScoreForPly2;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public String getFScoreP1() {
        return fScoreP1;
    }

    public String getFScoreP2() {
        return fScoreP2;
    }

    public void setPlayer(String ply1,String ply2) {
        this.player1 = ply1;
        this.player2 = ply2;
    }

    public void setFScoreP1(int fScrP1,int fScrP2) {
        if (fScrP1<0||fScrP1>4){
            fScrP1=0;
            fScoreP1="Error!";
        }else if (fScrP1==4&&fScrP2==4){
            fScrP1=0;
            fScrP2=0;
            fScoreP1="Error!";
            fScoreP2="Error!";
        }else if (fScrP2<0||fScrP2>4){
            fScrP2=0;
            fScoreP2="Error!";
        }else {
            fScoreP1 = "" + fScrP1;
            fScoreP2 = "" + fScrP2;
        }
        this.fScoreForPly1 = fScrP1;
        this.fScoreForPly2 = fScrP2;
    }
}
