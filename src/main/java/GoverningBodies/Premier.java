package GoverningBodies;

import GoverningBodies.FA;
import teams.Chelsea;
import teams.Liverpool;
import teams.ManCity;
import teams.ManUnited;

import java.util.HashMap;

public class Premier extends FA {
    public int prem;

    public Premier(String sport, int age, boolean progress) {
        super(sport,age, progress);
    }

    public void addTeam(Chelsea chelsea){
        this.premierHashMap.put(chelsea, chelsea);
        //this.premierArrayList.add(chelsea);
    }
    public void addTeam(ManCity manCity){
        this.premierHashMap.put(manCity, manCity);
        //this.premierArrayList.add(chelsea);
    }
    public void addTeam(Liverpool liverpool){
        this.premierHashMap.put(liverpool, liverpool);
        //this.premierArrayList.add(chelsea);
    }
    public void addTeam(ManUnited manUnited){
        this.premierHashMap.put(manUnited, manUnited);
        //this.premierArrayList.add(chelsea);
    }

    public int getPrem() {
    HashMap<String, Integer> prem = new HashMap<String, Integer>();
        prem.put("Arsenal", 1);
        prem.put("Everton", 2);
        prem.put("Aston villa", 3);
        prem.put("Manchester united", 4);
        prem.put("Man city", 5);
        prem.put("Chelsea", 6);
        prem.put("Liverpool", 7);
        prem.put("Leeds united", 8);
        prem.put("Crystal palace", 9);
        prem.put("Newcastle", 10);
        prem.put("Tottenham", 11);
        prem.put("Leicester city", 12);
        prem.put("Brighton", 13);
        prem.put("Brentford", 14);
        prem.put("Watford", 15);
        prem.put("Burnley", 16);
        prem.put("Norwich", 17);
        prem.put("Southampton", 18);
        prem.put("West ham", 19);
        prem.put("Wolves", 20);
        return (1);
    }
}


//FA cup
//relegation 3 spots
//return team name "","","",""