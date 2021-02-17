package dat109;

import java.util.ArrayList;
import java.util.List;

public class Bedrift {

    private String navn;
    private String tlfnummer;
    private Adresse adresse;
    private List<Utleiekontor> filialer;
    private List<Bil> biler;
    public int antallFilialer;
    public int antallBiler;

    public Bedrift(String navn, String tlfnummer, Adresse adresse){
        this.navn = navn;
        this.tlfnummer = tlfnummer;
        this.adresse = adresse;
        filialer = new ArrayList<Utleiekontor>();
        biler = new ArrayList<Bil>();
        antallFilialer = 0;
        antallBiler = 0;
    }

    public void leggTilBil(Bil bil){
        biler.add(bil);
        antallBiler++;
    }

    public void fjernBil(Bil bil){
        biler.remove(bil);
        antallBiler--;
    }

    public void leggTilFilial(Utleiekontor filial){
        filialer.add(filial);
        antallFilialer++;
    }

    public void fjernFilial(Utleiekontor filial){
        filialer.remove(filial);
        antallFilialer--;
    }



    
}
