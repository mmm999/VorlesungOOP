package Einfuehrung;

/**
 * Beispiel 02: GleichheitsTest.java
 * @author Mutz
 */
class GleichheitsTest {

   public static void main(String[] args){
	int i = 1, j=1;
	System.out.println(i==2);
	System.out.println(i);
	System.out.println(j=2);
	System.out.println(j++);
	System.out.println(j+=2);
	System.out.println(j<<=1);
	System.out.println(j%=3);
	System.out.printf("%d (x%04X)\n",j|=14,j);
        System.out.print(~j+1);

   }
   
    
}


