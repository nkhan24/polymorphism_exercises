package games;

import java.util.ArrayList;

public abstract class Games {
    protected ArrayList<Sport> sports;
    private String sport;
    protected int age;

    protected boolean progress;

    public Games(String sport, int age, boolean progress) {
        this.sport = sport;
        this.age = age;
        this.sports = new ArrayList<>();
        this.progress = true;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isProgress() {
        return progress;
    }

    public void setProgress(boolean progress) {
        this.progress = progress;
    }
}

