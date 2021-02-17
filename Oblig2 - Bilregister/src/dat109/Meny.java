package dat109;

import java.io.PrintWriter;
import java.util.Scanner;

public class Meny {

    boolean go;
    Scanner tastatur;

    public Meny(Scanner tastatur){

        Adresse adr1 = new Adresse("Pæreveien 2", "Eplelia", 4567);
        Adresse adr2 = new Adresse("Plommeveien 4", "Steinroysa", 1234);
        Adresse adr3 = new Adresse("Agurkveien 29", "Skogen", 2312);
        Adresse adr4 = new Adresse("Polseveien 12", "Slaktern", 4967);
        Adresse adr5 = new Adresse("Fiskeveien 2", "Elv", 4588);
        Adresse adr6 = new Adresse("Flomveien 2", "Elv", 4588);
        Adresse adr7 = new Adresse("Skoleveien 33", "Studieaasen", 3367);
        Adresse adr8 = new Adresse("Blyantveien 19", "Studieaasen", 3367);
        Adresse adr9 = new Adresse("Portgaten 2", "Bergen", 5555);
        Adresse adr10 = new Adresse("Storgaten 3", "Oslo", 0154);


        Bil bil1 = new Bil("KK66779", "Volvo", "240", "Ildrød", Utleiegruppe.A, true);
        Bil bil2 = new Bil("EF67867", "Tesla", "Model 3", "Violet", Utleiegruppe.A, false);
        Bil bil3 = new Bil("CD34567", "Tesla", "Model S", "Elefantgrå", Utleiegruppe.A, true);
        Bil bil4 = new Bil("AB12345", "BMW", "i3", "Sjøgrønn", Utleiegruppe.A, true);

        Kunde k1 = new Kunde("Jan", "Banan", adr1, "12312312");
        Kunde k2 = new Kunde("Johan", "Banansen", adr2, "67676767");
        Kunde k3 = new Kunde("Julie", "Bollekinn", adr3, "33312312");
        Kunde k4 = new Kunde("Sissel", "Kakao", adr4, "12312992");

        Utleiekontor utl1 = new Utleiekontor(0001, adr5, "45674567");
        Utleiekontor utl2 = new Utleiekontor(0002, adr6, "78978900");

        Bedrift bedr = new Bedrift("KieseLexander Rentals", "99999999", adr9);
        bedr.leggTilBil(bil1);
        bedr.leggTilBil(bil2);
        bedr.leggTilBil(bil3);
        bedr.leggTilBil(bil4);
        bedr.leggTilFilial(utl1);
        bedr.leggTilFilial(utl2);


        this.tastatur = tastatur;
        go = true;


        initiate();

        while(go){
            System.out.println("Skriv inn brukerID(Selskap har ID 1 og kontorene har ID 2 og 3)");
            int valg = Integer.parseInt(tastatur.nextLine());
            if(valg == 1){
                selskapsmeny(bedr);
            }else{
                kontormeny(valg);
            }


        }
    }

    public void selskapsmeny(Bedrift bedr){
        System.out.println("1 for nytt kontor");
        System.out.println("2 for ny bil");
        System.out.println("3 for å vise info");
        int valg = Integer.parseInt(tastatur.nextLine());

        if(valg == 1)
            opprettKontor();
        if(valg ==2)
            opprettBil();
        if(valg == 3)
            System.out.println(bedr.toString());

    }


    public void kontormeny(int id){

    }



    public void initiate(){


    }
}
