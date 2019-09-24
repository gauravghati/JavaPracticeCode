package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {

    private List<Team> TeamList = new ArrayList<>();
    private String leaguename;

    public League(String leaguename) {
        this.leaguename = leaguename;
    }

    public boolean addTeam(T team){
        if(TeamList.contains(team)){
            return false;
        }
        TeamList.add(team);
        System.out.println(team.TeamName()+" Team Added!! in "+leaguename);
        return true;
    }

    public void print(){
        System.out.println("Team List of "+leaguename);
        Collections.sort(TeamList);
        for(Team t : TeamList){
            System.out.println(t.TeamName()+" : "+t.ranking());
        }
    }

}
