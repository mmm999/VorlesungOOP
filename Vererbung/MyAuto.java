/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vererbung;

/**
 *
 * @author Mutz
 */
public class MyAuto extends Fahrzeug{
     private String priv(){
         return ("überdeckte Methode");
     }
     
     @Override
     public String pub(){
         return priv();
     }
}
