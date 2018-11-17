package ObjekteKlassen;

public class MyToStringClass {

    public static void main(String[] args) {
        MyToStringClass myToString = new MyToStringClass();
        System.err.println("Ausgabe nach toString: " + myToString.toString());
        
        //System.err.println("Ausgabe nach toString: " + myToString);
    }

    @Override
    public String toString(){
        return "Hallo Java Studis!";
    }
}
