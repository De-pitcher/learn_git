package com.IntroductionToInheritance;

public class DemoTennisGame {
    public static void main(String[] args) {
        TennisGame tennisGame=new TennisGame();
        DoublesTennisGame dTennisGame=new DoublesTennisGame();
        tennisGame.setPlayer("Emeka","Chidi");
        dTennisGame.setPlayer("Emeka","Chidi",
                "Ralph","Chima");
        tennisGame.setFScoreP1(4,4);
        dTennisGame.setFScoreP1(3,4);
        System.out.println("Game between "+tennisGame.getPlayer1()
        +" and "+tennisGame.getPlayer2()+" ended "+tennisGame.getFScoreP1()
                +":"+tennisGame.getFScoreP2());
        System.out.println("Game between "+dTennisGame.getPlayer1()
                +" and "+dTennisGame.getPlayer2()+" with "+
                dTennisGame.getSPlayer2()+" and "+dTennisGame.getsPlayer2()
                +" ended "+dTennisGame.getFScoreP1() +":"+
                dTennisGame.getFScoreP2());
    }
}
