package com.company;

public class Main {

    public static void main(String[] args) {

        BaseBallPlayer  joe= new BaseBallPlayer("Joe");
        FootBallPlayer rathi = new FootBallPlayer("Rathi");
        SoccerPlayer  rohit = new SoccerPlayer( "Rohit");
        FootBallPlayer manish = new FootBallPlayer("Manish");
        BaseBallPlayer gaurav = new BaseBallPlayer("Gaurav");
        BaseBallPlayer sahil = new BaseBallPlayer("Sahil");
        SoccerPlayer sooraj  = new SoccerPlayer("Sooraj");
        FootBallPlayer aman = new FootBallPlayer("Aman");


        Team<FootBallPlayer> sparksOnFootBAll = new Team<>("SPARKS");
        Team<FootBallPlayer> KolkattaRiders = new Team<>("NIGHTRIDERS");
        sparksOnFootBAll.addPLayer(rathi);
        sparksOnFootBAll.addPLayer(manish);
        KolkattaRiders.addPLayer(aman);

        //System.out.println(""+sparksOnFootBAll.numPLayer());

        Team<BaseBallPlayer> fireOnBaseBall = new Team<>("FIREONBALL");
        Team<BaseBallPlayer> weAreLossers = new Team<>("WE loss");
        fireOnBaseBall.addPLayer(sahil);
        fireOnBaseBall.addPLayer(gaurav);
        weAreLossers.addPLayer(joe);

        Team<SoccerPlayer> BallsOfSoccer = new Team<>("SOCCER HEROS");
        Team<SoccerPlayer> HardTime = new Team<>("HardTime");
        BallsOfSoccer.addPLayer(rohit);
        HardTime.addPLayer(sooraj);

        BallsOfSoccer.matchResult(HardTime,3,6);
        fireOnBaseBall.matchResult(weAreLossers,45,69);
        sparksOnFootBAll.matchResult(KolkattaRiders,34,34);

        System.out.println("Ranking...");

        System.out.println(fireOnBaseBall.TeamName()+" : "+fireOnBaseBall.ranking());
        System.out.println(BallsOfSoccer.TeamName()+" : "+BallsOfSoccer.ranking());
        System.out.println(sparksOnFootBAll.TeamName()+" : "+sparksOnFootBAll.ranking());
        System.out.println(weAreLossers.TeamName()+" : "+weAreLossers.ranking());
        System.out.println(HardTime.TeamName()+" : "+HardTime.ranking());
        System.out.println(KolkattaRiders.TeamName()+" : "+KolkattaRiders.ranking());

        System.out.println("BallsOfSoccer and HardTime  "+BallsOfSoccer.compareTo(HardTime));
        System.out.println("fireOnBaseBall and weAreLossers  "+fireOnBaseBall.compareTo(weAreLossers));
        System.out.println("sparksOnFootBAll and KolkattaRiders  "+sparksOnFootBAll.compareTo(KolkattaRiders));

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        //challenge 2 is edited with ConceptOfGeneric//

        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

        League<Team<FootBallPlayer>> leagueOfFootBall = new League<>("FootBall League");
        leagueOfFootBall.addTeam(sparksOnFootBAll);
        leagueOfFootBall.addTeam(KolkattaRiders);

        League<Team<BaseBallPlayer>> baseBallLeague = new League<>("BAseBall League");
        baseBallLeague.addTeam(fireOnBaseBall);
        baseBallLeague.addTeam(weAreLossers);

        League<Team<SoccerPlayer>> soccerLeagur = new League<>("Soccer League");
        soccerLeagur.addTeam(BallsOfSoccer);
        soccerLeagur.addTeam(HardTime);

        leagueOfFootBall.print();
        baseBallLeague.print();
        soccerLeagur.print();

    }
}
