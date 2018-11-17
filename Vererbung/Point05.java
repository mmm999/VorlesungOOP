/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vererbung;

import java.awt.Point;

/**
 *
 * @author Mutz
 */
public class Point05 extends Point{

    public Point05(int x,int y){
        super(x,y);
    }
    
    public static void main(String[] args) {
        Point05[] points = new Point05[4];

        
        
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point05((int) (Math.random() * 100), (int) (Math.random() * 100));
        }

        for (Point05 p : points) {
            System.out.println(p);
        }

    }
    
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
