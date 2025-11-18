package at.htl.gehaltsrechnung;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mitarbeiter {
    protected String _name;
    protected long _id;
    private static long _staticID = 0;
    protected String _abrechnungsperiode;
    protected Character _abrechnungstyp;
    protected long _verdienst;
    protected long _startMonat;
    protected long _endMonat;

    Mitarbeiter(String name, String abrechnungsperiode, Character abrechnungstyp, long monatsverdienst) {
        _name = name;
        _abrechnungsperiode = abrechnungsperiode;
        _abrechnungstyp = abrechnungstyp;

        _id = ++_staticID;
        checkAbrechnungsperiode(monatsverdienst);
    }

    private void checkAbrechnungsperiode(long monatsverdienst) {
        Pattern pattern = Pattern.compile("\\s*(1[0-2]|[1-9])\\s*-\\s*(1[0-2]|[1-9])\\s*");
        Matcher matcher = pattern.matcher(_abrechnungsperiode);

        if(!matcher.matches()){
            throw new FalseInputException("Abrechnungsperiode war im falschen Format!");
        }

        _startMonat = Integer.parseInt(matcher.group(1));
        _endMonat = Integer.parseInt(matcher.group(2));

        if(_startMonat > _endMonat){
            throw new FalseInputException("Endmonat war kleiner als Startmonat!");
        }
    }

    private void calculateVerdienst(long monatsverdienst){
        _verdienst = monatsverdienst * (_endMonat - _startMonat + 1);
    }



    @Override
    public String toString(){
        return String.format("Name: %s ID: %d Abrechnungsperiode: %s Abrechnungstyp: %s", _name, _id, _abrechnungsperiode, _abrechnungstyp);
    }
}
