package Vererbung;

public class Mitarbeiter {
    String name;
    public Mitarbeiter (String nachname){
	name = nachname;
    }
    
    public Mitarbeiter () {}
    
    public void toll(){
        System.out.println("toll");
    }
}

