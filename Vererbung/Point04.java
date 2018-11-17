package Vererbung;

import java.awt.Point;
import java.util.Random;

public class Point04 extends Point{

    public Point04(int x, int y){
        super(x,y);
    }
    
    private boolean overrideMethode = true;
        
    public String ausgabe(){
        if (x<10 && y<10) {
            return "(0"+x+",0"+y+")";
        }
        else if (x<10) {
            return "(0"+x+","+y+")";
        }
        else if (y<10) {
            return "("+x+",0"+y+")";
        }
        return "("+x+","+y+")";
    }
    
    public static void main(String[] args) {
        Point04[] points = new Point04[4];
        Random r = new Random();
                
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point04(r.nextInt(100), r.nextInt(100)); 
        }

        for (Point04 p : points) {
            System.out.println(p);
        }
    }
    
    @Override
    public String toString(){
        return (overrideMethode) ? ausgabe() : super.toString();
    }
}
