package VariablenTypen;

/**
 *
 * @author Mutz
 */
public class VarParameter {

    static int max(int...array){
        int currentMax = Integer.MIN_VALUE;
        for(int maxIndex : array)
            if (maxIndex > currentMax) currentMax = maxIndex;
        return currentMax;
    }

    public static void main(String[] args) {
        char a='0';
        System.out.println(max(max(1, 2, 9, 3),max(2,3,4,5,a))); //? 

    }
}
