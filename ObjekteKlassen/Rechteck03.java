package ObjekteKlassen;

/**
 * Beispiel 08: Rechteck03.java
 * @author mutz
 */
public class Rechteck03 {
    double breite;
    double laenge;

    public Rechteck03(){
	breite = laenge = 1;
    }

    public Rechteck03(double seite){
        breite = laenge = seite;
    }

    public Rechteck03(double breite, double laenge){
        this.breite = breite;
	this.laenge = laenge;
    }

    double getUmfang() {
        return 2 * (breite + laenge);
    }
}
