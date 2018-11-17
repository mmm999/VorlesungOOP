package ObjekteKlassen;

/**
 * Beispiel 07: Kreis03.java
 * @author Prof. Dr. Martin Mutz
 */
public class Kreis03 {
    private double radius;

    public Kreis03(double radiuswert){
	radius = 1;
    }
    
    public Kreis03(float radiuswert){
	radius = 2;
    }


    public double getRadius(){
	return radius;
    }

    public void setRadius(double wert){
        if(wert >= 0.0)
            radius = wert;
    }

}


