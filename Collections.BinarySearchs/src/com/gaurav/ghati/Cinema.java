package com.gaurav.ghati;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Cinema {
    private final String cinemaName;
    private List<Seat> seats= new LinkedList<>();

    public Cinema(String cinemaName , int numberOfRows, int seatPerRows){
        this.cinemaName = cinemaName;
        int lastRow = 'A' + (numberOfRows-1);
        for(char row = 'A'; row<=lastRow;row++){
            for(int j = 1 ;j<=seatPerRows;j++){
                seats.add(new Seat(""+row +String.format("%02d",j)));
            }
        }
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void getSeat(){
        for(Seat s: seats){
            System.out.println(s.seatNum);
        }
    }

    public void reserveSeat(String seatNum){

          Seat requestedseat = new Seat(seatNum);
          int foundSeat = Collections.binarySearch(seats,requestedseat,null);    //return the position where the element is
          if(foundSeat>=0){
              seats.get(foundSeat).reserve();
          }else {
              System.out.println("Seat not found : "+seatNum);
          }
//          for(Seat s : seats) {
//            if (s.getSeatNum().equals(seatNum)) {
//                requestedseat = s;
//                break;
//            }
//        }
//        if(requestedseat == null){
//            System.out.println("There is no seat!"+seatNum);
//        }else {
//            requestedseat.reserve();
//        }
    }


    private class Seat implements Comparable<Seat>{
        private final String seatNum;
        private boolean reserved = false;

        public Seat(String seatNum){
            this.seatNum = seatNum;
        }

        @Override
        public int compareTo(Seat o) {
            return this.seatNum.compareToIgnoreCase(o.getSeatNum());
        }

        public String getSeatNum() {
            return seatNum;
        }

        public void reserve(){
            if(!this.reserved){
                System.out.println("Your seat "+seatNum+" is reserved");
                reserved = true;
            }else{
                System.out.println("seat is already reserved");
            }
        }

        public void cancel(){
            if(this.reserved){
                System.out.println("your seat "+ seatNum +" is cancled");
                reserved = false;
            }else{
                System.out.println("Seat is not even reserved yet");
            }
        }
    }


}
