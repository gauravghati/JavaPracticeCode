package com.gaurav.ghati;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<Integer>();
        Set<Integer> cubes = new HashSet<Integer>();

        for(int i=0;i<10;i++){
            squares.add(i);
            cubes.add(i*i);
        }
        System.out.println("Size of squares : "+squares.size() + "\nSize of Cubes : "+cubes.size());

        Set<Integer> union = new HashSet<Integer>(squares);
        union.addAll(cubes);
        System.out.println("Union size : "+union.size());
        System.out.println(" Union of two sets : " +union);

        Set<Integer> intersection = new HashSet<Integer>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection size : "+intersection.size());
        System.out.println("Intersection of the cubes : "+intersection);

        if(union.containsAll(intersection)){
            System.out.println("intersection is the subset of the union");
        }

        Set<Integer> setDifferrence = new HashSet<Integer>(union);
        setDifferrence.removeAll(intersection);
        System.out.println("Set diiference : "+setDifferrence);

        Set<String> gaurav = new HashSet<String>();
        String s = "Hey this is Gaurav and i code in java..with javafx and C and C++";
        String[] words = s.split(" ");
        gaurav.addAll(Arrays.asList(words));
        System.out.println("Gaurav : "+gaurav);

        Set<String> sooraj = new HashSet<String>();
        String str2 = "Hey! this is sooraj and i am a web developer!";
        String[] wordsStr = str2.split(" ");
        sooraj.addAll(Arrays.asList(wordsStr));
        System.out.println("Sooraj : "+sooraj);

    }
}
