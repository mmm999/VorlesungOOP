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
public class Binär {
    public static void main(String[] args) {
        int zahl = 10;  // die zu transformierende Zahl
        
        for (int i = 31; i >= 0; i--) {
            System.out.print(((zahl & (1 << i)) !=0 ) ? 1 : 0);
        } 
    }
}
