/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Einfuehrung;

import java.awt.Point;

/**
 *
 * @author Mutz
 */
class Kreis {
  double radius;
  int a;
    public static void main(String[] args ){
        Kreis kreis = new Kreis(); 
        kreis.radius = -0.5; 	   // Radius wird auf -10 (?!) gesetzt

        System.out.println("Umfang =" + (2*Math.PI*kreis.radius)); // U = 2pi * r
    }
}

