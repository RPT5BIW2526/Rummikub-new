
/**
 * class Speelveld - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Speelveld
{
    private Blokje[][] speelveld = new Blokje[15][8];
    private Blokje blokje;

    boolean positieCheck(int rij, int kolom){
        boolean positieCorrect = false;
        if(rij >= 0 && rij <= speelveld.length){
            if(kolom >= 0 && kolom < speelveld.length){
                positieCorrect = true;
            }
        }
        return positieCorrect;
    }

    boolean validBlokjeCombo(Blokje nieuwBlokje, int rij , int kolom){
        if(!positieCheck(rij, kolom)) {
            return false;
        }

        if(kolom > 0 && speelveld[rij][kolom -1] != null){
            Blokje vorige = speelveld[rij][kolom - 1];
            if (vorige.getWaarde() != nieuwBlokje.getWaarde() - 1 || vorige.getKleur() != nieuwBlokje.getKleur()) {
                return false;
            }
        }
        
        if (kolom < speelveld[0].length - 1 && speelveld[rij][kolom + 1] != null) {
            Blokje volgende = speelveld[rij][kolom + 1];
            if (volgende.getWaarde() != nieuwBlokje.getWaarde() + 1 || volgende.getKleur() != nieuwBlokje.getKleur()) {
                return false;
            }
        }
        return true;
    }

    public void voegBlokjeToe(Blokje b, int rij, int kolom){
        if(positieCheck(rij, kolom)){
            speelveld[rij][kolom] = b;
        }
    }

    public void verwijderBlokje(int rij, int kolom){
        if(positieCheck(rij, kolom)){
            speelveld[rij][kolom] = null;
        }
    }
}