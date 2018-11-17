package Algorithmen;

import java.util.*;

public class MyFirstCollection {
    private static void fill(Collection <String> c){
    	c.add("Konrad");
    	c.add("Karoline");
    	c.add("Adriane");
  }
    public static void main(String[] args) {
        	List <String> c = new LinkedList <>();
        	fill(c);
    	System.out.println(c); 
	Collections.sort(c);
    	System.out.println(c);  
   }
}

