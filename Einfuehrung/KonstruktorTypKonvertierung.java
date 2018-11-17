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
public class KonstruktorTypKonvertierung {
    
    public KonstruktorTypKonvertierung(byte b){
        System.out.println("byte");
    }
    
    //public KonstruktorTypKonvertierung(char c){
    //    System.out.println("char");
    //}
    
   // public KonstruktorTypKonvertierung(int i){
   //     System.out.println("int");
   // }
    
    //public KonstruktorTypKonvertierung(long l){
    //    System.out.println("long");
    //}
    
    public KonstruktorTypKonvertierung(float f){
        System.out.println("float");
    }
    
    public KonstruktorTypKonvertierung(double d){
        System.out.println("double");
    }
    
    public static void main(String[] args) {
        KonstruktorTypKonvertierung k1 = new KonstruktorTypKonvertierung('1');
        k1.a(1);
    }
    
    void a (float f){
        System.out.println("a");
    }
    
    void a (double f){
        System.out.println("b");
    }
}
