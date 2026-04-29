import java.util.ArrayList;

/**
 * De klasse Bord beheert een lijst van Blokje-objecten.
 * Je kan blokjes toevoegen, verwijderen en opzoeken.
 */
public class Bord {
    private ArrayList<Blokje> blokjes;

    /**
     * Maakt een nieuw leeg bord aan.
     * De lijst van blokjes start als een lege ArrayList.
     */
    public Bord() {
        blokjes = new ArrayList<Blokje>();
    }

    /**
     * Geeft de volledige lijst van blokjes terug.
     *
     * @return een ArrayList met alle blokjes op het bord
     */
    public ArrayList<Blokje> getBlokjes() {
        return blokjes;
    }

    /**
     * Voegt een blokje toe aan het bord.
     *
     * @param blok het Blokje dat toegevoegd moet worden
     */
    public void blokjeToevoegen(Blokje blok) {
        blokjes.add(blok);
    }

    /**
     * Verwijdert een blokje op een bepaalde index, als de index geldig is.
     *
     * @param index de positie van het blokje dat verwijderd moet worden
     */
    public void blokjeVerwijderen(int index) {
        if (index >= 0 && index < blokjes.size()) {
            blokjes.remove(index);
        }
    }

    /**
     * Zoekt de index van een bepaald blokje in de lijst.
     *
     * @param blok het Blokje dat gezocht wordt
     * @return de index van het blokje, of -1 als het niet gevonden wordt
     */
    public int indexVanBlokje(Blokje blok) {
        return blokjes.indexOf(blok);
    }
}
