package com.gaurav.ghati;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer,Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExits("E",3);
        locations.get(1).addExits("N",5);
        locations.get(1).addExits("W",2);
        locations.get(1).addExits("S",4);

        locations.get(2).addExits("N",5);

        locations.get(3).addExits("W",1);

        locations.get(4).addExits("N",1);
        locations.get(4).addExits("W",2);

        locations.get(5).addExits("W",2);
        locations.get(5).addExits("S",1);

        Map<String, String> words = new HashMap<String, String>();
        words.put("QUIT","Q");
        words.put("NORTH","N");
        words.put("SOUTH","S");
        words.put("WEST","W");
        words.put("EAST","E");

        int loc = 1;
        while (true){
            System.out.println(locations.get(loc).getDiscription());
            if(loc == 0){
                break;
            }

            Map<String,Integer> exits = locations.get(loc).getExit();
            System.out.print("Available options are : ");
            for(String s : exits.keySet()){
                System.out.print(s+", ");
            }
            System.out.println();

            String[] wordsArray = scanner.nextLine().toUpperCase().split(" ");

            for(String s : wordsArray){
                if(words.containsKey(s)){
                    loc = exits.get(words.get(s));
                    break;
                }else if(exits.containsKey(s)){
                    loc = exits.get(s);
                    break;
                }
            }
        }
    }
}
