package GoverningBodies;

import sport.Sport;

import java.util.ArrayList;

public abstract class FIA extends Sport {


    protected ArrayList<Sport> sports;
    private String sport;



    public FIA(String sport, int age, boolean progress, String type, String body) {
        super(sport, age, progress);
        this.sports = new ArrayList<>();
    }
}
