
package ObjekteKlassen;

/**
 * Beispiel 06: Rechteck01.java
 * @author mutz
 */
public class Rechteck01 {
    double breite;
    double laenge;

    double getFlaeche() {
        return breite * laenge;
    }
    
    public static void main(String[] args) {
        
        Rechteck01 rechteck = new Rechteck01();

        rechteck.breite = 7.0;
        rechteck.laenge = 3.0;
                
        System.out.println("Rechteck: " + rechteck.getFlaeche());
      
    }
}



