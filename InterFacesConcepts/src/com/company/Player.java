package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String playerName;
    private int hitPoint;
    private int Strength;
    private String weapon;

    public Player(String playerName, int hitPoint, int strength, String weapon) {
        this.playerName = playerName;
        this.hitPoint = hitPoint;
        Strength = strength;
        this.weapon = weapon;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getStrength() {
        return Strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", hitPoint=" + hitPoint +
                ", Strength=" + Strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public void read(List<String> Arr) {
        if(Arr != null && Arr.size()>0){
            this.playerName = Arr.get(0);
            this.hitPoint = Integer.parseInt(Arr.get(1));
            this.Strength = Integer.parseInt(Arr.get(2));
            this.weapon = Arr.get(3);
        }
    }

    @Override
    public List<String> write() {
        List<String> values= new ArrayList<String>();
        values.add(0,this.playerName);
        values.add(1,""+this.hitPoint);
        values.add(2,""+this.Strength);
        values.add(3,""+this.weapon);
        return values;
    }

}
