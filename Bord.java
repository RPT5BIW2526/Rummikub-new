import java.util.ArrayList;
public class Bord{
    private ArrayList<Blokje> blokjes;

    public Bord()
    {
        blokjes = new ArrayList<Blokje>();
    }
    
    public ArrayList<Blokje> getBlokjes(){
        return blokjes; 
    }
    
    public void blokjeToevoegen(Blokje blok){
        blokjes.add(blok);
    }
    
    public void blokjeVerwijderen(int index){
        if(index >= 0 && index < blokjes.size()){
            blokjes.remove(index); 
        }
    }
    
    public int indexVanBlokje(Blokje blok){
        return blokjes.indexOf(blok); 
    }
    
    
}