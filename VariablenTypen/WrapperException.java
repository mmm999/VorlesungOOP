package VariablenTypen;

import java.util.Scanner;

public class WrapperException {

    public static void main(String[] args) {
        
      while ( true ) { 
        try   { 
           String s = javax.swing.JOptionPane.showInputDialog("Zahl eingeben" ); 
           int number = Integer.parseInt( s ); 
           break; 
         } 
        catch (NumberFormatException e) { 
            System.err.println( "Das war keine Zahl!" ); 
            javax.swing.JOptionPane.showMessageDialog(null, "Das war keine Zahl!");
      } 
     } 
    }
}
