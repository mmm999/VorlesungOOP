/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vererbung;
/**
 *
 * @author Mutz
 */
public class TestKonto {
    public static void main(String[] args) {
        Girokonto2 gk = new Girokonto2(123);
        Konto ko = new Konto(321);
        ko.saldo = 500;
        
        gk.setLimit(100);
        gk.saldo = 500;
        
        //gk.zahleAus(700);
        gk.zahleAus2(500);
        ko.zahleAus(600);
        
        System.out.println("Konto (" + ko.ktonummer + "): " + ko.saldo);
        System.out.println("Girokonto (" + gk.ktonummer + "): " + gk.saldo);
        
        
        
    }
}
