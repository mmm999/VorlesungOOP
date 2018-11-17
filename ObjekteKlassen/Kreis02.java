package ObjekteKlassen;

/**
 * Lösung von Seite 13 Kapitel 3: Kreis02.java
 * @author Prof. Dr. Martin Mutz
 */
public class Kreis02 {
    private double radius;  // kein direkter Zugriff von Aussen

    public double getRadius(){ // von Aussen erreichbar
        return radius;
    }

    public void setRadius(double wert){
        if(wert<0) {
            System.err.println("Wert ist negativ!");
            radius=-wert;
            
        }
        else {
            radius = wert;
        }
        //radius = Math.abs(wert);
    }
    
    public double getUmfang(){
        return 2*Math.PI*radius;
    }
    public double getFläche(){
        return Math.PI*radius*radius;
        
    }
    
}
