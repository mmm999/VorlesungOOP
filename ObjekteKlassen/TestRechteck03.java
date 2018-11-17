package ObjekteKlassen;

/**
 * Beispiel 08: TestRechteck03.java
 * Testet die Datei Rechteck03.java
 * @author mutz
 */
public class TestRechteck03 {
    public static void main(String[] args) {
        // new Rechteck03(); // um static zu zeigen
        Rechteck03 r1 = new Rechteck03();
        Rechteck03 q1 = new Rechteck03(10.0);
        Rechteck03 r2 = new Rechteck03(10.0,20.0);

        System.out.println(r1.getUmfang());
        System.out.println(q1.getUmfang());
        System.out.println(r2.getUmfang());
    }
}
