package com.moreObjectConcept;

public class DogTrialParticipant1 {
    private final int NUM_EVENTS;
    private static int totalCumulativeScore=0;
    private String name;
    private int obedienceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double avg;
    private boolean scoreAgree;
    public DogTrialParticipant1(String name, int numEvents, int score1, int score2, int score3){
        this.name=name;
        NUM_EVENTS=numEvents;
        if(NUM_EVENTS==0)
            avg=0;
        else
            avg=(double)total/NUM_EVENTS;
        int totalNot0=0;
        if(score1!=0)
            totalNot0=totalNot0+1;
        if(score2!=0)
            totalNot0=totalNot0+1;
        if(score3!=0)
            totalNot0=totalNot0+1;
        if(numEvents==totalNot0)
            scoreAgree=true;
        else
            scoreAgree=false;
        if(scoreAgree) {
            obedienceScore = score1;
            conformationScore = score2;
            agilityScore = score3;
        }else {
            obedienceScore=0;
            conformationScore=0;
            agilityScore=0;
        }
        if (!scoreAgree)
            System.out.println("Notice! Number of events for "
                    +name+"does not agree with scores reported.");
    }
    public void display(){
        System.out.println(name+" participated in "+NUM_EVENTS+
                " events and has an average score of "+avg);
        System.out.println("  "+ name+" has a total score of "+total+" bringing the total cumulative score to "+totalCumulativeScore);
    }
}
