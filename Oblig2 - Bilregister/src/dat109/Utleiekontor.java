package dat109;

public class Utleiekontor {

    private int filialnr;
    private Adresse adresse;
    private String tlfnummer;

    public Utleiekontor(int filialnr, Adresse adresse, String tlfnummer){
        this.filialnr = filialnr;
        this.adresse = adresse;
        this.tlfnummer = tlfnummer;
    }

    public int getFilialnr() {
        return filialnr;
    }

    public void setFilialnr(int filialnr) {
        this.filialnr = filialnr;
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

}
