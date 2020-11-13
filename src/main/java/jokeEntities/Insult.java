package jokeEntities;

/**
 *
 * @author claes
 */
public class Insult {
    
    private String number;
    private String insult;
    private String url;

    public Insult(String insult, String url) {
        this.url=url;
        this.insult=insult;
    }

    public String getNumber() {
        return number;
    }

    public String getInsult() {
        return insult;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
}