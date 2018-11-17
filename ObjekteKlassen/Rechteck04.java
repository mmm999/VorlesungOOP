package ObjekteKlassen;

/**
 *
 * @author mutz
 */
public class Rechteck04 {
    double breite;
    double laenge;

    public Rechteck04(){
	this(1.0,1.0);
    }

    public Rechteck04(double seite){
        this(seite,seite);
        
    }

    public Rechteck04(double breite, double laenge){
        this.breite = breite;
	this.laenge = laenge;
    }

    double getUmfang() {
        return 2 * (breite + laenge);
    }
  //static { System.out.println("Zwei"); }
  //static { System.out.println("Eins"); }

}
