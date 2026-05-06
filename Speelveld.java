
/**
 * class Speelveld - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Speelveld
{
    private Blokje[][] Speelveld = new Blokje[15][8];
    private Blokje blokje;
    
    boolean positieCheck(int rij, int kolom){
        boolean positieCorrect = false;
        if(rij >= 0 && rij <= Speelveld.length){
            if(kolom >= 0 && kolom <= Speelveld.length){
                positieCorrect = true;
            }
        }
        return positieCorrect;
    }
    
    boolean validBlokjeCombo(Blokje b){
        boolean valid = false;
        if(){
            
        }
    }
    
    public void voegBlokjeToe(Blokje b, int rij, int kolom){
        if(positieCheck(rij, kolom)){
            Speelveld[rij][kolom] = b;
        }
    }
    
    public void verwijderBlokje(int rij, int kolom){
        if(positieCheck(rij, kolom)){
            Speelveld[rij][kolom] = null;
        }
    }
}