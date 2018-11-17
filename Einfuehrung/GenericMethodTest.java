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
public class GenericMethodTest {
    /*public static void printArray(Integer[] a) {
        for (Integer i : a)
            System.out.printf(i + " ");
    }
    
    public static void printArray(Double[] a) {
        for (Double d : a)
            System.out.printf(d + " ");
    }
    
    public static void printArray(String[] a) {
        for (String s : a)
            System.out.printf(s + " ");
    }
    */
    public static <T> void printArray(T[] a) {
        for (T i : a) 
            System.out.printf(i + " ");
    }
    
    public static void main(String[] args) {
        Integer[] ia = {1, 2, 3, 4, 5, 6};
        Double[]  da = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        String[]  sa = {"a", "b", "c", "d", "e"};

        printArray(ia);
        System.out.println();
                
        printArray(da);
        System.out.println();
        
        printArray(sa);
    }
    
}
