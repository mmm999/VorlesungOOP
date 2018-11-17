package Vererbung;

import java.util.ArrayList;

public class Notizen {
    private ArrayList <String> notizen;

    public Notizen(){
        notizen = new ArrayList <String>() ;
    }

    public void aufnehmen(String s){
        notizen.add(s);
    }

    public void ausgebenNotizen(){
        for(String eintrag : notizen){
            System.out.println(eintrag);
        }
    }
    
    public static void main(String[] args) {
        Notizen myNote = new Notizen();
        int i = 1;
        
        for(String n : args)
            myNote.aufnehmen("Das ist mein " + i++ + ". Parameter: " + n);
        
        myNote.ausgebenNotizen();
            
    }
}
