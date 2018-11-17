package ObjekteKlassen;

public class TestOverride {

    public byte status;
    
    boolean equals(){
        System.out.println("in equals");
        return true;
    }
    
    boolean equals2(){
        System.out.println("in equals2");
        return super.equals(this);
    }
        
    @Override
    public boolean equals(Object obj){
        System.out.println("in überschriebener Methode equals");
        // Quellcode zur Überprüfung auf Gleichheit
        
        if (this.status == ((TestOverride)obj).status)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        TestOverride to1 = new TestOverride();
        TestOverride to2 = new TestOverride();
   
        to1.status = 1;
        to2.status = 2;
        
        if(to1.equals())
            System.out.println("gleich");
        else
            System.out.println("ungleich");
        
        if(to1.equals(to2))
            System.out.println("gleich");
        else
            System.out.println("ungleich");
        
        if(to1.equals2())
            System.out.println("gleich");
        else
            System.out.println("ungleich");
    }
    
}
