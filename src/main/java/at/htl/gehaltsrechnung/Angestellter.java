package at.htl.gehaltsrechnung;

public class Angestellter extends Mitarbeiter {
    private long _gehalt;


    Angestellter(String name, String abrechnungsperiode, long gehalt){
        _gehalt = gehalt;
        super(name, abrechnungsperiode, 'G', gehalt);
    }

    @Override
    public String toString(){
        return super.toString() + String.format(" Gehalt: %s", _gehalt);
    }
}
