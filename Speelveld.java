
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
        boolean valid = false;
        Blokje vorigeBlokjeRij = speelveld[rij][kolom-1];
        Blokje volgendBlokjeRij = speelveld[rij][kolom+1];
        if(positieCheck(rij, kolom)){
            if(vorigeBlokjeRij != null && volgendBlokjeRij != null){
                if(vorigeBlokjeRij.getWaarde() == nieuwBlokje.getWaarde() - 1 || volgendBlokjeRij.getWaarde() == nieuwBlokje.getWaarde() + 1 ){
                   valid = true;
                }   
            }
        }
        return valid;
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