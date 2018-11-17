/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Einfuehrung;
import static java.lang.Math.*;

/**
 *
 * @author mutz
 */
public class TestGenauigkeit {
    public static void main(String[] args) {
        System.out.println("1 / 3 = " + (1d/3));    // d statt .
        System.out.println("1 / 3 = " + (10D/3));   // D statt .
        
        byte b = 127;
        System.out.println((byte)128);
        
        System.out.println(sqrt(4)); 	
	System.out.println(pow(2,3)); 
        System.out.println(log(E)); 
        
    }
    
}
