package VariablenTypen;

//~--- JDK imports ------------------------------------------------------------

import java.awt.Point;

/**
 *
 * @author Mutz
 */
public class Length {
    public static void main(String[] args) {
        int    prim[] = { 2, 3, 5, 7, 7 + 4 };
        String var[]  = { "Haus", "Maus", "hund".toUpperCase(),    // ?
                          new java.awt.Point().toString() };

        System.out.println(prim.length + var.length);

        // Was wird hier gemacht und was ist das Ergebnis ?
        String zeichenkette = "123abcABC".toLowerCase();

        zeichenkette = "123abcABC".toUpperCase();
        System.out.println(zeichenkette);
        System.out.println(zeichenkette.toLowerCase().toUpperCase());
        System.out.println("123abcABC".toLowerCase().toUpperCase());

        /*Point[] points = new Point[4];

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point((int) (Math.random() * 100), (int) (Math.random() * 100));
        }

        for (Point p : points) {
            System.out.println(p.toString());
            System.out.println(p);
            System.out.println();
        }*/
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
