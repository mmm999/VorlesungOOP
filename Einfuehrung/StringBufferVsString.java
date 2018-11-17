/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Einfuehrung;


/**
 *
 * @author mutz
 */
public class StringBufferVsString {
    
    public static void main(String[] args) {
        String s;
        s = "";
        long t;
              
        t = System.currentTimeMillis();
        for (int i = 0; i < 1000_000; i++) {
            s += "x";
        }
        System.out.println("StringTime: \t" + (System.currentTimeMillis() - t));
        
        
        StringBuffer sb = new StringBuffer(); // bei 99_999 verdoppelt

        t = System.currentTimeMillis();
        for (int i = 0; i < 1000_000; i++) {
            sb.append("x");
        }
        System.out.println("StringBufferTime : " + (System.currentTimeMillis() - t));
        
        
       /* StringBuilder sb2 = new StringBuilder(); // bei 99_999 verdoppelt
        t = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            sb2.append("x");
        }
        System.out.println("StringBuilderTime: " + (System.currentTimeMillis() - t));
        */
        // s = sb.toString();
                
        // System.out.println("Länge: " + sb.length());
        // System.out.println("Kapazität: " + sb.capacity());
        
   
        // System.out.println(s);
    }
    
}
