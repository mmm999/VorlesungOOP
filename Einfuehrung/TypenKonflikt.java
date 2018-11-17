/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Einfuehrung;

/**
 *
 * @author Mutz
 */
public class TypenKonflikt {
    public static void main(String[] args) {
        double d=0;
        int i=0;
        
        d=i;
        i=(int)d;
        
        
    }
}
