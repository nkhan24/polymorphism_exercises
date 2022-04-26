package GoverningBodies;

import GoverningBodies.FIA;

import java.util.HashMap;

public class Formula extends FIA {

    public Formula(String sport, int age, boolean progress, String type, String body) {
        super(sport,age, progress, type, body);
    }

    public int teams() {
        HashMap<String, Integer> teams = new HashMap<String, Integer>();
        teams.put("Mercedes", 1);
        teams.put("Ferrari", 2);
        teams.put("Red bull", 3);
        teams.put("Mclaren", 4);
        teams.put("Haas", 5);
        teams.put("Alpha tauri", 6);
        teams.put("Williams", 7);
        teams.put("Alfa romeo", 8);
        teams.put("Aston martin", 9);
        teams.put("Alpine", 10);
        return (2);
    }
}
//races - interface
//Location UK, Monaco, USA, Bahrain




