package VariablenTypen;

import java.util.Arrays;

/**
 *
 * @author Mutz
 */
public class Array01{

    int i[];
    
    public Array01(int[] a) {
        i = a.clone();
    }

    

    @Override
    public String toString() {
        String s = "*** ";
        for(int e : i){
            s+=e+" ";
        }
        return s+" ***";
    }
    
     public String toStringFromObject() {
        String s = super.toString();
        return s;
    }
    
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] b1 = a1.clone();

        Array01 a2 = new Array01(a1);

        System.out.println(Arrays.equals(a1,b1));
        System.out.println("default: "+a1);//.toString());
        System.out.println("alt: "+Arrays.toString(a1));
        System.out.println("neu: "+a2.toString()); // oder
        System.out.println("neu: "+a2.toStringFromObject()); 
                

    }
   
}
