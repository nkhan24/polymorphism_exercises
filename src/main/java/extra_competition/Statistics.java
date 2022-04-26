package extra_competition;

import GoverningBodies.Ashes;

public class Statistics extends Ashes implements Info, COVID_Restrictions{
    public Statistics(String name, int age, boolean progress, String type, String body) {

        super(name, age, progress, type, body);
    }

    public String bestPlayers(){
        return "Ollie Robinson - ENG, Joe Root - ENG, Marnus Labuschagne - AUS, Jhye Richardson - AUS";
    }
    @Override
    public void suspension(){

    }
}




//Stats: highest runs
//Most wins in history
//Stats as interface