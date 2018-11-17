/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vererbung;

/**
 *
 * @author Mutz
 */
public class TestStudent2 {
    public static Comparable getMax(Comparable[] obj){
        Comparable max = obj[0];
        
        for (Comparable o : obj) {
            if (o.compareTo(max) > 0) max = o;
        }
        
        return max;
    }
    
    public static void sort(Comparable[] obj){
        boolean sorted;
        do {
            sorted = true;
            Comparable tmp; 
            for (int i=0; i < obj.length-1; ++i) {
                if (obj[i].compareTo(obj[i+1]) > 0) {
                    tmp = obj[i];
                    obj[i] = obj[i+1];
                    obj[i+1] = tmp;
                    sorted = false;
                }
            }
        } while (!sorted);
    }
    
    public static void ausgabe(Comparable v[]){
        for(Comparable st : v){
            System.out.print(st+" ");
        }
    }
    
    public static void main(String[] args){
        Student2[] stud = new Student2[2];
        stud[0] = new Student2("Mayer",25);
        stud[1] = new Student2("Müller",23);
        
        ausgabe(stud);
             
        System.out.println("\nMax: "+getMax(stud));
        
        String v[] = {"DEF", "GHI","ABC"};
        ausgabe(v);
        System.out.println("\nMax: "+getMax(v));
        sort(v);
        ausgabe(v);
        
        // mit Integer zeigen
    }
}
