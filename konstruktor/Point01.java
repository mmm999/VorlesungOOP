package konstruktor;

/**
 * Beispiel 09: Point01.java
 * @author Mutz
 */
import java.awt.Point;

public class Point01 {
       
    public static void main(String[] args) {
        java.awt.Point p1 = new java.awt.Point(); // Standardkonstruktor
                
        //oder p1.setLocation( 10, 10 );
        p1.x = 10;
        p1.y = 10;

        System.out.println( "[x="+p1.x +",y="+ p1.y+"]");

        Point p2 = new Point( 10, 10 ); // parametrisierter Konstruktor
        System.out.println( "[x="+p2.x +",y="+ p2.y+"]");

        Point p3 = new Point( p2 ); // parametrisierter Konstruktor
        System.out.println( "[x="+p3.x +",y="+ p3.y+"]\n");
        
        System.out.println(p1);
        System.out.println(p1.toString());
        
    }
    
   
}
