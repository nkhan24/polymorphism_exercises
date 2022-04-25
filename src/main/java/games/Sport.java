package games;

public class Sport {
    private String sport;
    private String type;
    private String body;


    public Sport(String sport, String type, String body) {
        this.sport = sport;
        this.type = type;
        this.body = body;
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

    public String makeNoise(){
        return "crowd celebration";
    }
}


