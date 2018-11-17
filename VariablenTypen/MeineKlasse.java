/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VariablenTypen;

/**
 *
 * @author Mutz
 */
class MeineKlasse {
//public int a;
public static int a;

public MeineKlasse(int a){
	this.a = a;
}

public static void main(String[] args){
	MeineKlasse mk = new MeineKlasse(23);
	System.out.println(a); 	// Compilerfehler
       	System.out.println(mk.a); 	// ok
        
}
}

