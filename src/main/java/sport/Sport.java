package sport;

import java.security.PublicKey;

public class Sport {
    private String sport;
    private String type;
    private String body;

    private int age;
    private boolean progress;

    public Sport(String sport, int age, boolean progress) {
        this.sport = sport;
        //this.type = type;
        //this.body = body;
        this.age = age;
        this.progress = true;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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

    //behaviour
    public String makeNoise(){
        return "crowd celebration";
    }

    public String type(){
        return "";
        }

    public String body(){
        return "";
    }
}




