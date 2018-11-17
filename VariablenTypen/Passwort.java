/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// geht nur unter DOS, da NetBeans Fehler
package VariablenTypen;

import java.io.Console;


public class Passwort {
    public static void main(String[] args) {
        Console cons;
        if ((cons = System.console()) != null) {
            cons.printf("Name eingeben:");
            String name = cons.readLine();

            cons.printf("Passwort eingeben:");
            char[] pass = cons.readPassword();

            cons.printf("%s",(("Sesam".equals(new String(pass)))
                    ? name+", Sie sind angemeldet"
                    : "Anmeldung fehlgeschlagen"));
           
        } else System.out.println("Konsole konnte nicht eingerichtet werden!");
    }
}
