package at.htl.gehaltsrechnung;

public class Arbeiter extends Mitarbeiter {
    private long _stundenlohn;
    private long _arbeitsstunden;

    Arbeiter(String name, String abrechnungsperiode, long stundenlohn, long arbeitsstunden) {
        _stundenlohn = stundenlohn;
        _arbeitsstunden = arbeitsstunden;
        super(name, abrechnungsperiode, 'L', stundenlohn * arbeitsstunden);
    }

    @Override
    public String toString(){
        return String.format(super.toString() + String.format(" Stundenlohn: %s Arbeitsstunden: %s ", _stundenlohn, _arbeitsstunden));
    }
}
