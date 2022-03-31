package com.Array;

public class BowlingTeam {
    private String teamName;
    private final String [] members=new String[4];

    public void setTeamName(String team) {
        this.teamName = team;
    }
    public String getTeamName() {
        return teamName;
    }

    public void setMembers(int number,String name) {
        members[number]=name;
    }

    public String getMembers(int number) {
        return members[number];
    }
}
