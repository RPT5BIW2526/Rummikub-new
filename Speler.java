import java.util.ArrayList;

public class Speler {

    private String naam;
    private int punten;
    private ArrayList<Blokje> bord;
    private boolean eersteBeurtGespeeld;

    public Speler(String naam) {
        this.naam = naam;
        this.punten = 0;
        this.bord = new ArrayList<>();
        this.eersteBeurtGespeeld = false;
    }

    public String getNaam() {
        return naam;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    public ArrayList<Blokje> getBord() {
        return bord;
    }

    public int getAantalBlokjes() {
        return bord.size();
    }

    public void voegBlokToeBord(Blokje blok) {
        bord.add(blok);
    }

    public void verwijderBlokVanBord(Blokje blok) {
        bord.remove(blok);
    }

    public int berekenPuntenBord() {
        int totaal = 0;
        for (Blokje blok : bord) {
            totaal += blok.getWaarde();
        }
        return totaal;
    }

    public boolean heeftGeldigeEersteBeurt(ArrayList<Blokje> gekozenBlokjes) {
        int totaal = 0;
        for (Blokje blok : gekozenBlokjes) {
            totaal += blok.getWaarde();
        }
        return totaal >= 30;
    }

    public boolean eersteBeurtGespeeld() {
        return eersteBeurtGespeeld; 
    }

    public void setEersteBeurtGespeeld(boolean gespeeld) {
        this.eersteBeurtGespeeld = gespeeld;
    }

    public boolean heeftGewonnen() {
        return bord.isEmpty();
    }

    public String toString() {
        return naam + " heeft " + bord.size() + " blokjes op zijn bord en " + punten + " punten.";
    }
}