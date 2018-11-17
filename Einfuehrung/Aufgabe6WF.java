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
public class Aufgabe6WF {

    public static void main(String[] abc)
    {
        int i = 18,
            j = 0,
            k = 36;
        boolean b = false,
                c = false,
                d = true;
        
        

        if (i*j*k != 0) // geht auch ohne logische Operatoren!
        {
            System.out.println("i, j und k sind alle verschieden von null.");
        }

        if ((i%17==0) && (i>0))
        {
            System.out.println("i ist durch 17 teilbar und echt positiv.");
        }

        //if ((j%2>0) && (j>=20) && (j<=40))
        if ((j%2>0) && (j>19) && (j<41))
        {
            System.out.println("j ist ungerade und liegt zwischen 20 und 40.");
        }
        
        if ((k%5==0) && ((k%3==0)^(k%7==0)^(k%11==0)) && (k>0))
        {
            System.out.println("k ist entweder vielfaches von 3 und 5, oder Vielfaches von 5 und 7, oder Vielfaches von 5 und 11.");
        }
        
        if ((b&&(!(c||d))) || (c&&(!(b||d))) || (d&&(!(b||c))))
        {
            System.out.println("Genau eines von b, c und d ist true.");
        }

        //if ( !(b^c) && !(c^d) )
        if ( !((b^c) || (c^d)) )
        {
            System.out.println("b, c und d sind alle drei true oder alle drei false.");
        }
    }
}

