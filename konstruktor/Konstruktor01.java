package konstruktor;

/**
 *
 * @author Mutz
 */

public class Konstruktor01 {
    int     i;
    boolean b;
    float   f;
    double  d;
    char    c;
    String  s;

    public Konstruktor01(){
        // hat keine Bedeutung, wenn leer
        System.out.println("--- überschriebener Default-Konstruktor ---");
    }

    public Konstruktor01(double k){
        // hat keine Bedeutung, wenn leer

        System.out.println("--- bin im Konstruktor1 ---");
       
    }

    public Konstruktor01(double i, double j){
        // hat keine Bedeutung, wenn leer
        System.out.println("--- bin im Konstruktor2 ---");
        i=9;
        f = 5.5f;
    }

   public static void main(String[] args) {
        Konstruktor01 konst  = new Konstruktor01();
        Konstruktor01 konst3 = new Konstruktor01(1.,1.);
        Konstruktor01 konst2 = new Konstruktor01(1);

        System.out.println("i: "+konst.i);
        System.out.println("b: "+konst.b);
        System.out.println("f: "+konst.f);
        System.out.println("d: "+konst.d);
        System.out.println("c: "+(konst.c));
        //System.out.printf("c: %c%d\n",konst.c, (int)konst.c);
        System.out.println("s: "+konst.s);
   }
}