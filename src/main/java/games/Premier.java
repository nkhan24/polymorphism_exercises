package games;

import java.util.HashMap;

public class Premier extends Games{
    public int prem;

    public Premier(String sport, int age, boolean progress) {
        super(sport, age, progress);
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
