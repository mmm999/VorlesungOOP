package konstruktor;



public class Point02 extends java.awt.Point{
       
    public static void main(String[] args) {
                
        Point02 myPoint = new Point02(); 
        myPoint.setLocation(1,1);
        System.out.println(myPoint);
        System.out.println(myPoint.toString());
    }
    
    @Override
    public String toString(){
            
            return "(x="+ x*10 +",y="+ y*10+")";
            
    }
}
