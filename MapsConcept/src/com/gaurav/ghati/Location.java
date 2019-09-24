package com.gaurav.ghati;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int lcationID;
    private final String discription;
    private final Map<String,Integer> exit;

    public Location(int lcationID, String discription) {
        this.lcationID = lcationID;
        this.discription = discription;
        this.exit = new HashMap<String, Integer>();
        this.exit.put("Q",0);
    }
    public void addExits(String direction, int location){
        exit.put(direction,location);
    }

    public String getDiscription() {
        return discription;
    }

    public Map<String, Integer> getExit() {
        return new HashMap<String, Integer>(exit);
    }

}
