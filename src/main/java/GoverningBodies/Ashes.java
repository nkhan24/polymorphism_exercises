package GoverningBodies;

import GoverningBodies.ICC;

import java.util.ArrayList;

public class Ashes extends ICC {
    public Ashes(String sport, int age, boolean progress) {
        super(sport, age, progress);
    }

    public ArrayList<String> teams;{
        ArrayList<String> teams = new ArrayList();
        teams.add("England");
        teams.add("Australia");
    }
}

//Stats: highest runs
//Most wins in history
//Stats as interface