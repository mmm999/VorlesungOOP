package ObjekteKlassen;

/**
 * Beispiel 11: AutoStatic.java
 * @author Mutz
 */
public class AutoStatic {
    // zähle die Methodenaufrufe aller Objekte
    static int anzUnterwegs = 0; 	// alle Objekte zählen mit
    int geschwindigkeit = 0;
    int tmp ;

    void fahre_los() {
        tmp ++;
       anzUnterwegs++; 		// zähle Klassenvariable hoch
       geschwindigkeit = 100; 	// setze Objektvariable
    }

    void halte_an() {
       anzUnterwegs--; 		// zähle Klassenvariable runter
       geschwindigkeit = 0; 	// setze Objektvariable
    }
    
    public static void main(String[] args) {
        AutoStatic meinAuto = new AutoStatic(); 
        AutoStatic meinAuto2 = new AutoStatic();
        meinAuto.fahre_los();       
        meinAuto2.fahre_los();
        System.out.println("tmp:" + meinAuto.tmp);
        System.out.println("tmp" + meinAuto2.tmp);
        System.out.print("Anzahl fahrender Fzg.: " + AutoStatic.anzUnterwegs);
    }

}
