package games;

import java.util.ArrayList;

public class Ashes extends Games{
    public Ashes(String sport, int age, boolean progress) {
        super(sport, age, progress);
    }

    public ArrayList<String> teams;{
        ArrayList<String> teams = new ArrayList();
        teams.add("England");
        teams.add("Australia");
    }
}
