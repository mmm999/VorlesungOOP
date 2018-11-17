
package Einfuehrung;

/**
 *
 * @author mutz
 */
public class Array {
    public static void main(String[] args) {
        // double myArray[] = {1,2,3};
        double myArray[] = new double[5];
        myArray[0]=1;
        myArray[1]=2;
        myArray[2]=3;
        System.out.println("Ergebnis: " + mittelwert(myArray));
    }
    
    static public double mittelwert(double[] y){
        double m = 0.0;

        for(int i = 0; i < y.length; i++)
            m = m + y[i];

        return m/y.length;
}

}
