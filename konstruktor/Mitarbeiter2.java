package konstruktor;

public class Mitarbeiter2 {
    /**
     * Hier kommt der Horst rein!
     */
    String name;
    public Mitarbeiter2 (String nachname){
	name = nachname;
    }

    public Mitarbeiter2 (){
	name = "Max Mustermann";
    }
    
    public String getInfoPerson(){
        return "Name: " + name;
    }
}
