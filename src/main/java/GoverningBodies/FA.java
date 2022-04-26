package GoverningBodies;

import sport.Sport;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class FA extends Sport {

    protected HashMap<Premier,Premier> premierHashMap;
    protected ArrayList<Premier> premierArrayList;



    public FA(String sport, int age, boolean progress) {
        super(sport, age, progress);
        this.premierHashMap = new HashMap<>();
    }

    public HashMap<Premier, Premier> getPremierHashMap() {
        return premierHashMap;
    }

    public void setPremierHashMap(HashMap<Premier, Premier> premierHashMap) {
        this.premierHashMap = premierHashMap;
    }
}
