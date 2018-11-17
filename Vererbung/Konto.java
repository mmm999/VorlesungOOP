/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vererbung;

/**
 *
 * @author Mutz
 */
public class Konto {
    int ktonummer;
    double saldo;
    
    Konto(){}

    Konto(int ktonummer) {
       this.ktonummer = ktonummer;
    }

    Konto(int ktonummer, double saldo){
       this.ktonummer = ktonummer;
       this.saldo = saldo;
    }

    void zahleAus (double betrag){
       if (betrag <= saldo)
           saldo -= betrag;
    }

}
