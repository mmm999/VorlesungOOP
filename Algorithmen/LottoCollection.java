/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithmen;

import java.util.Random;
import java.util.TreeSet;

public class LottoCollection {
   private Random r;
   private TreeSet<Integer> zahlen;
   private int zahl, aus;
   
   public LottoCollection(){
     r = new Random();
     zahlen = new TreeSet<Integer>();
   }
	
   public void ziehen(int zahl, int aus){
     this.zahl = zahl;
     this.aus  = aus;
     
     zahlen.clear();  
     while (zahlen.size()<zahl){
        zahlen.add(r.nextInt(aus)+1);
     }
   }
    
   public void ausgeben(){
     System.out.print("Die Ziehung (" + zahl + " aus " + aus + ") ergab: ");  
     for (Integer z : zahlen){
         System.out.print(z + " ");
      }
     System.out.println();
   }
}
