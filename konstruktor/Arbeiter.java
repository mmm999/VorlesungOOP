/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktor;

/**
 *
 * @author Martin
 */
public class Arbeiter extends Mitarbeiter {
    double stundenlohn;
    
    public Arbeiter(String name, int stundenlohn){
       super(name); // ruft Konstr. von Mitarbeiter auf
       // super();  // nicht erlaubt
       this.stundenlohn = stundenlohn;
    }
    
    public Arbeiter(int stundenlohn){
       super(); 
       this.stundenlohn = stundenlohn;
    } 
    
    public Arbeiter(){
       super(); // was passiert hier, wenn KOmmentar --> Max Mustermann
       // ODER
       //this("Martin Mutz",1);
       this.stundenlohn = 1.;
    }
    
    @Override
    public String getInfoPerson(){
        return "Nachname: " + name + "\n" + "Stundenlohn:" + stundenlohn;
    }
    
    public String getInfoPerson2(){
        return super.getInfoPerson();
    }
    
    public static void main(String[] args) {
        Arbeiter arbeiter1 = new Arbeiter("Martin Mutz", 5);
        Arbeiter arbeiter2 = new Arbeiter();
        System.out.println(arbeiter1.name + ", " + arbeiter1.stundenlohn +" €");
        System.out.println(arbeiter2.name + ", " + arbeiter2.stundenlohn +" €");
        System.out.println("");
        System.out.println(arbeiter1.getInfoPerson());
        System.out.println(arbeiter2.getInfoPerson());
        System.out.println("");
        
        System.out.println(arbeiter1.getInfoPerson2());
        System.out.println(arbeiter2.getInfoPerson2());
        
    }
}

