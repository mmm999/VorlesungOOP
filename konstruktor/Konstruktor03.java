package konstruktor;

/**
 *
 * @author Mutz
 */

public class Konstruktor03 {
    int     i;
   
    public Konstruktor03(){
        System.out.println("--- bin im Konstruktor ---");
    }

    @Override
    public void finalize() throws Throwable{
        try{}
        finally {
            // da finalize überschrieben wird, muss ich hier obere Instanz aufrufen
            System.out.println("--- bin im Destruktor ---");
            super.finalize();
        }
    }
    
    public static void main(String[] args) {
        Konstruktor02 konst = new Konstruktor02();

        System.out.println("i: "+konst.i);
              
        konst = null;
        System.gc();

   }
}
