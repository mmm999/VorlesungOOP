package ObjekteKlassen;

/**
 *
 * @author mutz
 */
public class Kreis04 {
    private double radius;

    public Kreis04(double r1, int r2, double r3){
	radius = r1+r2+r3;
    }

    public Kreis04(double radius, float r3){
        this(radius, 1, r3);
        this.radius = radius+r3;
        System.out.println("foo2");
    }

    public Kreis04(int radius, float r3){
        this(radius, 2, r3);
        this.radius = radius+r3;
        System.out.println("foo1");
    }

    public Kreis04(){

        this(1.0,1.0f);
        //this(3,1); 
        System.out.println("Standardkonstruktor"); 
        
    }

    public double getRadius(){
	return radius;
    }
}


