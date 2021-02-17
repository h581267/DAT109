package dat109;

public class Bil {

    private String regNummer;
    private String merke;
    private String modell;
    private String farge;
    private Enum<Utleiegruppe> utleiegruppe;
    private boolean ledig;

    public Bil(String regNummer, String merke, String modell, String farge, Enum<Utleiegruppe> utleiegruppe, boolean ledig){
        this.regNummer = regNummer;
        this.merke = merke;
        this.modell = modell;
        this.farge = farge;
        this.utleiegruppe = utleiegruppe;
        this.ledig = ledig;
    }

    public String getRegNummer() {
        return regNummer;
    }

    public void setRegNummer(String regNummer) {
        this.regNummer = regNummer;
    }

    public String getMerke() {
        return merke;
    }

    public String getModell() {
        return modell;
    }

    public String getFarge() {
        return farge;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }

    public Enum<Utleiegruppe> getUtleiegruppe() {
        return utleiegruppe;
    }

    public void setUtleiegruppe(Enum<Utleiegruppe> utleiegruppe) {
        this.utleiegruppe = utleiegruppe;
    }

    public boolean isLedig() {
        return ledig;
    }

    public void setLedig(boolean ledig) {
        this.ledig = ledig;
    }

    @Override
    public String toString(){
        return regNummer + "\n" + merke + " " + modell + ", " + farge + "\nUtleiegruppe: " + utleiegruppe + "\nStatus: " + ledigStatus();
    }

    public String ledigStatus(){
        if(isLedig()){
            return "Ledig";
        }
        else{
            return "Opptatt";
        }
    }
}
