package VariablenTypen;

/**
 * Lösung von Seite 28 Kapitel 3: Static.java
 * @author Prof. Dr. Martin Mutz
 */

public class Static {
    static int objNr=0; // was passiert, wenn static fehlt ?

    public Static(){
        System.out.println("Ich bin Objekt "+ ++objNr);
    }
    
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.name"));
        
        //for(int i=0;i<10;i++) 
          //   new Static();  // auch mal mit Parameter zeigen
    
             
    }
    
}
