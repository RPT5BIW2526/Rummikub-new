import java.util.ArrayList;
import java.util.Random;
public final class Zak {
    private ArrayList<Blokje> zakje;

    public Zak()
    {
        zakje = new ArrayList<Blokje>();
        maakBlokjesAan();
    }

    public void maakBlokjesAan()
    {
        for (int i = 1; i <= 13; i++)
        {
            zakje.add(new Blokje(i, Kleur.BLAUW, false));
            zakje.add(new Blokje(i, Kleur.BLAUW, false));
            zakje.add(new Blokje(i, Kleur.ROOD, false));
            zakje.add(new Blokje(i, Kleur.ROOD, false));
            zakje.add(new Blokje(i, Kleur.ZWART, false));
            zakje.add(new Blokje(i, Kleur.ZWART, false));
            zakje.add(new Blokje(i, Kleur.GEEL, false));
            zakje.add(new Blokje(i, Kleur.GEEL, false));
        }
        zakje.add(new Blokje(0, Kleur.ZWART, true));
        zakje.add(new Blokje(0, Kleur.ROOD, true));
    }

    public Blokje neemRandomBlokje()
    {
        Random r = new Random();
        int i = r.nextInt(zakje.size());

        Blokje b = zakje.get(i);
        zakje.remove(i);

        return b;
    }
}