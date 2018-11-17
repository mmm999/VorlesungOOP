/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjekteKlassen;

/**
 *
 * @author Mutz
 */
public class MyStringBuffer {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        System.out.println("Länge: " + s.length());
        s.append("Wir lernen Java.");
        System.out.println(s);
        System.out.println("Länge: " + s.length());
        s.insert(11, "seit Wochen ");
        
        System.out.println(s);
        System.out.println("Länge: " + s.length());
        
        for (int i = 20; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                s.setCharAt(i,'A');
            else if (s.charAt(i) == 'v')
                s.setCharAt(i,'V');
        }
        
        System.out.println(s);
    }
}
