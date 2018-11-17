package VariablenTypen;

//import VariablenTypen.PrimObj;

/**
 *
 * @author mutz
 */
public class TestPrimObj {
    public static void main(String[] args) {
        PrimObj k1 = new PrimObj();
        PrimObj k2 = new PrimObj();
        double wert = 1.0;

        System.out.println("prim Variable davor: "+wert);
        k1.primitiverAufruf(wert);
        System.out.println("prim Variable danach: "+wert);

        System.out.println("obj Variable davor: "+k2.wert);
        k1.objektAufruf(k2);
        System.out.println("obj Variable danach: "+k2.wert);

   }
}

