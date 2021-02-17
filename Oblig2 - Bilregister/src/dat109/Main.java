package dat109;

public class Main {

    public static void main(String[] args) {

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
        
        

    }
}
