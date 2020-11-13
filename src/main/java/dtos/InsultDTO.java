
package dtos;

import jokeEntities.Insult;

/**
 *
 * @author 45222
 */
public class InsultDTO {
    private String insult;
    private String url = "https://evilinsult.com/generate_insult.php?lang=en&type=json"; 
    private Insult ins;
    
    
    public InsultDTO(Insult ins) {
        this.insult = ins.getInsult();
        this.url = ins.getUrl();
    }

    public InsultDTO() {
    }
   

    public String getInsult() {
        return insult;
    }

    public void setInsult(String insult) {
        this.insult = insult;
    }
  public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public Insult getIns() {
        return ins;
    }

    public void setIns(Insult ins) {
        this.ins = ins;
    }

    
    
}
