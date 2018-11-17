/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjekteKlassen;

/**
 *
 * @author mutz
 */
public class TestKreis01 {

    public static void main(String[] args) {
        double u1, u2;
        Kreis01 kreis1 = new Kreis01();     // Kreis - Objekt kreis1 wird erzeugt
        kreis1.radius = 21.0;               // Radius des Objektes wird gesetzt
        u1 = kreis1.getUmfang();            // Objekt k1 berechnet seinen Umfang

        Kreis01 kreis2 = new Kreis01();    // weiteres Kreis - Objekt wird erzeugt
        kreis2.radius = 10.0;               // Radius wird auf -10 (?!) gesetzt
        u2 = kreis2.getUmfang();

        System.out.println("Gesamtumfang =" + (u1 + u2));
        // Strg + Space bei Math zeigen

        //System.out.println("Gesamtumfang: " + Math.round(u1) + " + " + Math.round(u2) + " = " + Math.round(u1 + u2));
    }
}