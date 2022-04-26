package extra_competition;

import GoverningBodies.Premier;

public class FACup extends Premier implements LastWinner, COVID_Restrictions {
    public FACup(String name, int age, boolean progress){

        super(name, age, progress);

}

public String faWinnerLast(){
        return "Leicester City";}

    @Override
    public void suspension(){

    }
}
