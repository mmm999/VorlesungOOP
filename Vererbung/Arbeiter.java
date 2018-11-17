package Vererbung;

//import Vererbung.Mitarbeiter;

public class Arbeiter extends Mitarbeiter {
    int stundenlohn;
    public Arbeiter(String name, int stundenlohn){
       //super(name); // ruft Konstr. von Mitarbeiter auf
       this.stundenlohn = stundenlohn;
       this.name = name;
       
    }
    
    @Override
    public void toll(){
        System.out.println("Ich sage: ");
        super.toll();
    }
    
    
    public static void main(String[] args) {
        Arbeiter ar = new Arbeiter("Mutz", 1);
        ar.toll();
        
    }
    
}

