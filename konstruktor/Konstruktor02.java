package konstruktor;

public class Konstruktor02 {
    final int   i = 1;        // Konstante
    static long j=0;
   
    public Konstruktor02(){
        // hat keine Bedeutung, wenn leer
        System.out.println("--- bin im Konstruktor (Objektnr.: "+j+") ---");
    }
        
    //@Override
    public void finalize() { // wo ist das definiert?
        System.out.println("-------- bin im Destruktor (Objektnr.: "+j+") ---");
    }
    
    public static void main(String[] args) {
        Konstruktor02 konst = new Konstruktor02();
        System.out.println("i: "+konst.i);
        
        //konst=null; 
        for(;;j++) 
            new Konstruktor02();
        
        // Referenz konst auf NULL setzen !!
        //System.gc();   // Garbage Collector aufrufen, nur wenn vorher auf null gesetzt
    }
}
