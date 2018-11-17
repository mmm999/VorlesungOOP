package konstruktor;

public class Arbeiter2 extends Mitarbeiter2 {
    double stundenlohn;
    public Arbeiter2(String name, double stundenlohn){
       //super(name); // ruft Konstr. von Mitarbeiter auf
       this.stundenlohn = stundenlohn;
    }

    public Arbeiter2 (int stundenlohn){
        //super();
        //super("Mutz");
        this("MM",1);
        //this.stundenlohn = stundenlohn;
        
    }
    
    public String getInfoPerson(){
        return "Nachname: " + name;
    }
    
    public static void main(String[] args) {
        //Mitarbeiter2 maschinenführer1 = new Mitarbeiter2("Martin");
        //Arbeiter2 ar2 = new Arbeiter2("Gandalf", 8.5);
        Arbeiter2 ar3 = new Arbeiter2(1);
        
        //Mitarbeiter2 maschinenführer2 = new Mitarbeiter2();
        //System.out.println(maschinenführer2.name);
        /*System.out.println(maschinenführer1.name);
        maschinenführer1.name = "Horst";
        System.out.println(maschinenführer1.name);
        System.out.println(ar2.name+"\n"+ar2.stundenlohn+ " €");
    */
        //System.out.println(ar3.name + " " + ar3.stundenlohn);
        System.out.println(ar3.getInfoPerson());
    }
    
}
