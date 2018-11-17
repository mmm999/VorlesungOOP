/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vererbung;

/**
 *
 * @author admin
 */
public class TestMitarbeiter {
    public static void main(String[] args) {
        Arbeiter arbeiter = new Arbeiter("Mutz", 1);
        
        System.out.println("Name: " + arbeiter.name);
        System.out.println("Lohn: " + arbeiter.stundenlohn);
    }
}
