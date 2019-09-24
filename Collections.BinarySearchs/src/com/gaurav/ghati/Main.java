package com.gaurav.ghati;

public class Main {

    public static void main(String[] args) {
        Cinema pvrCinema = new Cinema("PVR Cinema",8,12);
//        pvrCinema.getSeat();

        pvrCinema.reserveSeat("H11");
        pvrCinema.reserveSeat("H11");
    }
}
