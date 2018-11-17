/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vererbung;

import java.awt.Point;
import java.util.Random;

/**
 *
 * @author Mutz
 */
public class Point03 {

    public static void main(String[] args) {
        Point[] points = new Point[4];
        Random r = new Random();

        for (int i = 0; i < points.length; i++) {
            //points[i] = new Point((int) (Math.random() * 100), (int) (Math.random() * 100));
            points[i] = new Point(r.nextInt(100), r.nextInt(100));
        }

        for (Point p : points) {
            System.out.println(p);
        }

    }
}
