package GoverningBodies;

import sport.Sport;

import java.util.ArrayList;

public abstract class ICC extends Sport {


    protected ArrayList<Sport> sports;
    private String sport;



    public ICC(String sport, int age, boolean progress) {
        super(sport, age, progress);
        this.sports = new ArrayList<>();
    }
}
