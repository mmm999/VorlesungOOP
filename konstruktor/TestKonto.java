package konstruktor;

/** Beispiel 10: TestKonto.java
 * Testet die Datei Konto.java
 * @author Prof. Dr. Martin Mutz
 */
public class TestKonto {
    public static void main(String[] args) {
        Konto konto = new Konto(123,100);
        
        System.out.println("KNr. : " + konto.kontonummer);
        System.out.println("Saldo: " + konto.saldo);
    }
}
