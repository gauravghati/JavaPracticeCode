package com.company;

public class Main {

    public static void main(String[] args)
    {
         Porshe porshe = new Porshe(8,"Carrera",7,true);
         porshe.startengine();
         porshe.accelerate();
         porshe.breaks();

        Lotus lotus = new Lotus(8,"Carrera",7,true);
        lotus.startengine();
        lotus.accelerate();
        lotus.breaks();

        Honda honda = new Honda(8,"Carrera",7,true);
        honda.startengine();
        honda.accelerate();
        honda.breaks();
    }
}
