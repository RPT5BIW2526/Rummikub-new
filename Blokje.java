public class Blokje
{
    private int waarde;
    private Kleur kleur;
    private boolean joker;

    public Blokje(int waarde, Kleur kleur, boolean joker)
    {
        this.waarde = waarde;
        this.kleur = kleur;
        this.joker = joker;
    }

    public int getWaarde()
    {
        return waarde;
    }

    public Kleur getKleur()
    {
        return kleur;
    }

    public boolean isJoker()
    {
        return joker;
    }

    @Override
    public String toString()
    {
        if (joker) {
            return "Joker(" + kleur + ")";
        }
        return waarde + "-" + kleur;
    }
}
