package Interfaces;

/**
 *
 * @author mutz
 */
public class TestInterfaceZerstörbar {
    public static void main(String[] args) {
        Auto auto = new Auto();
        Flasche flasche = new Flasche();
        
        auto.zerstöre();
        flasche.zerstöre();
        
        // besser
        
        zerstöre(auto);
        zerstöre(flasche);
    }
    
    static void zerstöre(Auto obj){
        obj.zerstöre();
    }
    
    static void zerstöre(Flasche obj){
        obj.zerstöre();
    }
    
    // noch besser
    static void zerstöre(Zerstörbar obj){
        obj.zerstöre();
    }
}
