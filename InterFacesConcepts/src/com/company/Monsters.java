package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monsters implements ISaveable{
    private String Name;
    private int hitPoint;
    private int strength;

    public Monsters(String name, int hitPoint, int strength) {
        Name = name;
        this.hitPoint = hitPoint;
        this.strength = strength;
    }

    public String getName() {
        return Name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "Name='" + Name + '\'' +
                ", hitPoint=" + hitPoint +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0,this.Name);
        values.add(1,""+this.hitPoint);
        values.add(2,""+this.strength);
        return values;
    }

    @Override
    public void read(List<String> Arr) {
        if(Arr != null && Arr.size()>0){
            this.Name = Arr.get(0);
            this.hitPoint = Integer.parseInt(Arr.get(1));
            this.strength = Integer.parseInt(Arr.get(2));
        }
    }
}
