/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vererbung;

/**
 *
 * @author Mutz
 */
public class Fahrzeug {
    private String priv(){
         return ("private Methode");
     }
     
     public String pub(){
         return priv();
     }
}
