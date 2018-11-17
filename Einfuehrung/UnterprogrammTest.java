package Einfuehrung;

/**
 * Beispiel 03: UnterprogrammTest.java
 * @author Mutz
 */
class UnterprogrammTest {
   
    static String unterprogramm(){ 	             // keine Rückgabe	
        System.out.println("Hallo Hauptprogramm");
	return "Unterprogramm";
     }

     public static void main(String[] args){      // Programmstart
	System.out.print("Hallo " + unterprogramm());
     }

}
