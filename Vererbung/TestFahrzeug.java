/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vererbung;

/**
 *
 * @author Mutz
 */
public class TestFahrzeug {
    public static void main(String[] args) {
        MyAuto   a = new MyAuto ();
        Motorrad m = new Motorrad ();
        Fahrzeug f = new Fahrzeug();
    
        System.out.println(f instanceof Fahrzeug);  
        System.out.println(a instanceof Fahrzeug);   
        System.out.println(m instanceof Fahrzeug); 
        System.out.println(f instanceof MyAuto);   
        System.out.println(f instanceof Motorrad);  
               
        System.out.println("O: "+f.pub());
        System.out.println("S: "+a.pub());
        
    }
}
