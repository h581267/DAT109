package dat109;

public class Kunde {

    private String fornavn;
    private String etternavn;
    private Adresse adresse;
    private String tlfnummer;

    public Kunde(String fornavn, String etternavn, Adresse adresse, String tlfnummer){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.tlfnummer = tlfnummer;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getTlfnummer() {
        return tlfnummer;
    }

    public void setTlfnummer(String tlfnummer) {
        this.tlfnummer = tlfnummer;
    }

    public String toString(){
        return fornavn + etternavn + "\n" + tlfnummer + "\n" + adresse.toString();
    }
}
