package com.Array;

import java.util.Scanner;

public class BowlingTeamDemo4 {
    public static void main(String[] args) {
        final int NUM_TEAMS=4;
        BowlingTeam[] teams=new BowlingTeam[NUM_TEAMS];
        getTeamData(teams);
    }
    public static void getTeamData(BowlingTeam[] teams){
        String name;
        final int NUM_TEAMS=4;
        int x;
        int y;
        final int NUM_TEAM_MEMBERS=4;
        Scanner input=new Scanner(System.in);
        for (y=0;y<NUM_TEAMS;++y){
            teams[y]=new BowlingTeam();
            System.out.println("Enter team name >> ");
            name=input.nextLine();
            teams[y].setTeamName(name);
            for (x=0;x<NUM_TEAM_MEMBERS;++x){
                System.out.println("Enter team member's name >> ");
                name=input.nextLine();
                teams[y].setMembers(x,name);
            }
        }
    }
}
