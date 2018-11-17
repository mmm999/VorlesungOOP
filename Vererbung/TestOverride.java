package Vererbung;

public class TestOverride {
    
   boolean equals(){
        System.out.println("in equals");
        return true;
   }
   
   boolean equals2(){
       System.out.println("in quals 3");
       return super.equals(this);
   }
   
   @Override
   public boolean equals(Object obj){
       System.out.println("in quals 2");
       if(obj instanceof TestOverride)
            return true;
       else 
           return false;
   }
    
    public static void main(String[] args) {
        
        TestOverride to1 = new TestOverride();
        TestOverride to2 = new TestOverride();
        
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
