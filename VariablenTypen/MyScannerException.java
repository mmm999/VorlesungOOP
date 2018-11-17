package VariablenTypen;

//import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScannerException {

    public static void main(String[] args) {
        
        Scanner sc;
        double x=0;
        
        System.out.print("Bitte Zahl eingeben: ");
        
        // Fehler, wenn Fliesskommazahl, daher try catch
        
       
            try {
                sc = new Scanner(System.in);
                //x = sc.nextInt();
                //System.out.println(1/0);
                x = 1/0; 
                //x = 1/x; 
                
            }
            catch (ArithmeticException e){
                
                //System.out.println("\nRechenfehler: " + e);
                //System.out.println("Es wurde durch Null geteilt");
                javax.swing.JOptionPane.showMessageDialog(null, "Es wurde durch Null geteilt");//
            }
            // Wichtig: Exception muss immer als letztes stehen (vor den spez. Exceptions) 
           catch (InputMismatchException e){
                
                System.out.println("Fehler: " + e);
                System.out.println("Bitte nur Integerzahlen eingeben!");
                
            }  
            catch (Exception e){
                
                System.out.println("Fehler: " + e);
                System.out.println("Sonst");
                
            }   
         
                
       System.out.println("Quadrat von " + x + " ist " + x * x);
    }
}
