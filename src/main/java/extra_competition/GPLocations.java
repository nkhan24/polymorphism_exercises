package extra_competition;

import GoverningBodies.Formula;

public class GPLocations extends Formula implements GP, COVID_Restrictions {
    public GPLocations(String name, int age, boolean progress, String type, String body) {

        super(name, age, progress, type, body);
    }

    public String location(){
        return "USA, Monaco, UK, Belgium";
    }

    @Override
    public void suspension(){

    }
}
