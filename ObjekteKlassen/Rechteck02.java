package ObjekteKlassen;

import java.util.Objects;

/**
 *
 * @author mutz
 */
public class Rechteck02 {
    double breite;
    double laenge;

    double getUmfang() {
        return 2 * (breite + laenge);
    }

    void skalieren(double a) {
        breite = a * breite;
        laenge  = a * laenge;
    }

    void spiegeln() {
        double x = breite;

        breite = laenge;
        laenge  = x;
    }
    
  
  
    @Override
    public String toString() {
        String s = "Rechteck: " + breite + ", " + laenge;
        return s;
    }
   
   public static void main(String[] args) {
        Rechteck02 r = new Rechteck02();

        r.breite = 3.;
        r.laenge = 5.;

        //double u = r.getUmfang();

        //r.skalieren(2.);
        //r.spiegeln();
//r.
        //System.out.println(r.getUmfang());
        //System.out.println(r.toString());
        System.out.println(r.toString());
        //System.out.println(Objects.toString(r)); // Object(s): static seit Java 1.7
    }
}
