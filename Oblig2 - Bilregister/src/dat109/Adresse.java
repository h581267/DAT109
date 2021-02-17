package dat109;

public class Adresse {

    private String gateadresse;
    private String poststed;
    private int postnummer;

    public Adresse(String gateadresse, String poststed, int postnummer){
        this.gateadresse = gateadresse;
        this.poststed = poststed;
        this.postnummer = postnummer;
    }

    public String getGateadresse() {
        return gateadresse;
    }

    public void setGateadresse(String gateadresse) {
        this.gateadresse = gateadresse;
    }

    public String getPoststed() {
        return poststed;
    }

    public void setPoststed(String poststed) {
        this.poststed = poststed;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }

    public String toString(){
        return gateadresse + ", " + postnummer + " " + poststed;
    }
}
