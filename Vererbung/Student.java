package Vererbung;

// Datei: Student.java

public class Student extends Person  // die Klasse Student wird von
{                                    // der Klasse Person abgeleitet
   private int matrikelnummer;
   
      
    public Student(){
        
        System.out.println("im Student Konstruktor");
    }
   
   // Methoden der Klasse Student
   public void setMatrikelnummer (int matrikelnummer)
   {
      this.matrikelnummer = matrikelnummer;
   }

   public void printMatrikelnummer()
   {
      System.out.println ("Matrikelnummer: " + matrikelnummer);
      
   }
   
    /*@Override
    public void print()
    {
        System.out.println("neu überschriebene Methode");
        super.print(); // Vorteil, ich kann nachname private lassen
    }
    
    public void print2(){
        // Zugriff auf nachnamen und vornamen aus der oberen Klasse geht nicht, da private
        // System.out.println ("Nachname: " + nachname);
        // System.out.println ("Vorname: " + vorname); 
        //Zugriff auf print der Oberklasse
        print();
        System.out.println ("Matrikelnummer: " + matrikelnummer);

    }*/
}
