package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    private int matchePlayed = 0;
    private int won = 0;
    private int lost = 0;
    private int tie = 0;

    private ArrayList<T> members= new ArrayList<>();

    public Team(String TeamName) {
        this.name = TeamName;
    }

    public String TeamName() {
        return this.name;
    }

    public boolean addPLayer(T player){
        if(members.contains(player)) {
            System.out.println("PLayer is Already in the Team"+player.getName());
            return false;
        }else{
            members.add(player);
            System.out.println( player.getName()+"PLayer is Added in "+this.name);
        }
        return true;
    }

    public int numPLayer(){
        return this.members.size();
    }


    public void matchResult(Team<T> opposite,int thereScore,int ourScore){
        if(ourScore>thereScore) {
            System.out.println(this.name+" beats "+opposite.TeamName());
            won++;
        }else if(thereScore>ourScore){
            lost++;
            System.out.println(opposite.TeamName()+" beats "+this.name);

        }else {
            tie++;
            System.out.println("Match tie");

        }
        matchePlayed++;
    }


    public int ranking(){
        return (won*2)+tie ;
    }

    @Override
    public int compareTo(Team o) {
        if(o.ranking()>this.ranking()){
            return 1;
        }else if(o.ranking()<this.ranking()){
            return -1;
        }else{
            return 0;
        }
    }
}
