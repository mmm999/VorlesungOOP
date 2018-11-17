package VariablenTypen;

import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 0;
    
        System.out.print("Bitte Zahl eingeben: ");
        x = sc.nextDouble();
        
        //x = sc.nextInt();
        
        //x = sc.next(); 
        //x = Double.parseDouble(sc.next());
           
        System.out.println("Quadrat von " + x + " ist " + x * x);
        System.out.format("Quadrat von %.1f ist %.1f",x, x * x);
       // System.out.format("Quadrat von %.15f ist %.1f",1.1*100, x * x);
        
    }
}
