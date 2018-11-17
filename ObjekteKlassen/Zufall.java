/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjekteKlassen;

/**
 *
 * @author Mutz
 */
public class Zufall extends Object      {
    public static void main(String[] foo) {
        zufall();
    }

    public static void zufall(){
        Integer[] zufall = new Integer[5];

        for(int i = 0; i <= 4; i++)
            zufall[i] = (int)(Math.random()*100); // mit Integer geht das nicht

        for(int z : zufall)
            System.out.println(z);

        for(int i=0;i<zufall.length;i++)
            System.out.println(zufall[i]);
    }
}
