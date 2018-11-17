/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Einfuehrung;

/**
 *
 * @author Mutz
 */
class Test {
    static double sum(double x, double y){
        double ergebnis = x + y;
        return ergebnis;
    }
    
    public static void main(String[] argv) {
        double y = 0.0;
           
        for (int i = 1; i <= 10; i++) {
            y+=1./(i*i);
            System.out.printf("%f\n", y);
        }
        
        System.out.printf("Ergebnis: %f \n",sum(1.2,1.3));
    }
}
