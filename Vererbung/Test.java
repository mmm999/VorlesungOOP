package Vererbung;

// Datei: Test.java

public class Test
{
   public static void main (String[] args)
   { 
      System.out.println ("Person");
      Person pers = new Person();
      pers.setName ("Müller","Frank");
      pers.print();

      System.out.println ("\nStudent");
      Student stud = new Student(); 
      stud.setName ("Maier", "Fritz");
      stud.setMatrikelnummer (56123);
      stud.print();
      stud.printMatrikelnummer();
      
   }
}
