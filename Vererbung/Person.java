package Vererbung;

// Datei: Person.java

public class Person
{
   private String nachname;
   public String vorname;
      
   public Person(){
          System.out.println("im Person Konstruktor");
   }

   public void setName (String nachname, String vorname)
   {
      this.nachname = nachname;
      this.vorname = vorname;
   }

   public void print()
   {
      System.out.println ("Nachname: " + nachname);
      System.out.println ("Vorname: " + vorname); 
   }
}
