/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Einfuehrung;


/**
 *
 * @author Mutz
 */
public class For_Schleife {
    public static void main(String[] args) {
       final byte ZEILEN  = 5;
       final byte SPALTEN = 6;
       Label2: 
       for (int i=0;; ++i){
           Label1:
           for (int j=0;; ++j) {
                if (i == ZEILEN) 
                   break Label2;
                if (j==SPALTEN){
                   System.out.println();
                   break Label1;
                }
                System.out.print((i+1)*(j+1) + "\t");
            }
        } 
        
    }
}
