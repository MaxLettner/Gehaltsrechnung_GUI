package at.htl.gehaltsrechnung;

public class Angestellte extends Mitarbeiter {
    private long _gehalt;


    Angestellte(String name, String abrechnungsperiode, long gehalt){
        _gehalt = gehalt;
        super(name, abrechnungsperiode, 'G', gehalt);
    }

    @Override
    public String toString(){
        return super.toString() + String.format(" Gehalt: %s", _gehalt);
    }
}
