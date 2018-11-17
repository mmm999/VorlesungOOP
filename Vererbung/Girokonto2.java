/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vererbung;

/**
 *
 * @author Mutz
 */
public class Girokonto2 extends Konto {
         // neu
     double limit=0;
     
     // neu
     void setLimit(double limit) {
         this.limit = limit;
     }

     public Girokonto2(int knr){
	super(knr);	
     }
     
     // überschrieben = modifiziert
   //@Override
     void zahleAus (double betrag) {
         if (betrag <= saldo+limit)
           saldo -= betrag;
     }
     
     void zahleAus2 (double betrag) {
         super.zahleAus(betrag);
     }
     

}
