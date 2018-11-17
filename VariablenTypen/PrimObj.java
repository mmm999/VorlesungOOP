package VariablenTypen;

public class PrimObj {
    double wert=1.0;
    
    public void primitiverAufruf(double wert){
	++wert;
    }

    public void objektAufruf(PrimObj obj){
	++obj.wert;
        
    }
}


