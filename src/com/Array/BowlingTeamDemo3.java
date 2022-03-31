package com.Array;

import java.util.Scanner;

public class BowlingTeamDemo3 {
    public static void main(String[] args) {
        String name;
        final int NUM_TEAMS=4;
        BowlingTeam []teams= new BowlingTeam[NUM_TEAMS];
        int y;
        Scanner input=new Scanner(System.in);
        for (y=0;y<NUM_TEAMS;++y){
            teams[y]=new BowlingTeam();
            System.out.println("Enter team name >> ");
            name=input.nextLine();
            teams[y].setTeamName(name);
            for (int x=0;x<NUM_TEAMS;++x){
                System.out.println("Enter team member's name >>");
                name=input.nextLine();
                teams[y].setMembers(x,name);
            }
        }
        for (y=0;y<NUM_TEAMS;++y) {
            System.out.println("\nMembers of " +
                    teams[y].getTeamName());
            for (int x = 0; x < NUM_TEAMS; ++x)
                System.out.println(teams[y].getMembers(x) + " ");
            System.out.println();
        }
        System.out.println("\n\nEnter a team to see it's roaster >>");
        name=input.nextLine();
        for (y=0;y< teams.length;++y){
            if (name.equals(teams[y].getTeamName()))
                for (int x=0;x<NUM_TEAMS;++x)
                    System.out.println(teams[y].getMembers(x)+" ");
        }
    }
}
