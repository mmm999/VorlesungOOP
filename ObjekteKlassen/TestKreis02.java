package ObjekteKlassen;

public class TestKreis02 {
    public static void main(String[] args) {
        Kreis02 kreis = new Kreis02();
        kreis.setRadius(-1);
        
        System.out.println("Umfang = " + (2*Math.PI*kreis.getRadius()));
        System.out.println("Umfang = " + kreis.getUmfang());
        System.out.println("Fläche = " + kreis.getFläche());
        
        
    }
}