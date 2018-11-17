package VariablenTypen;
//import java.math.BigDecimal;

import java.math.BigDecimal;

/**
 *
 * @author Martin Mutz
 */
public class Decimal {

    /**
     * mein Test
     * @param args tool zum Darstellen von ...
     */
    public static void main(String[] args) {
        System.out.println("100 * 1.3 = "+100*1.3);
        System.out.println("100 * 1.2 = "+100*1.2);
        System.out.format("100 * 1.1 = %3.15f",100*1.1); //mit %3.14f
        
        System.out.println("\n10/3="+10./3.);

             
        BigDecimal a = new BigDecimal("1.1");
        BigDecimal b = new BigDecimal("100");

        //Integer myInt = new Integer(7);
      //System.out.println("Binär: "+Integer.toBinaryString(7));
        
        //System.out.println("myInt: "+myInt);

        System.out.println("\nLösung: "+a.multiply(b));
    
         }
}
