 package ObjekteKlassen;

/**
 *
 * @author mutz
 */
public class TestRechteck04 {
    public static void main(String[] args) {
        // new Rechteck03(); // um static zu zeigen
        Rechteck04 r1 = new Rechteck04();
        Rechteck04 q1 = new Rechteck04(10.);
        Rechteck04 r2 = new Rechteck04(10.,20.);

        System.out.println(r1.getUmfang());
        System.out.println(q1.getUmfang());
        System.out.println(r2.getUmfang());
    }
}
