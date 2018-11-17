/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktor;


public class Mitarbeiter {
    /**
     * Name der Person
     */
    String name;
    public Mitarbeiter (String nachname){
	name = nachname;
    }
    
    public Mitarbeiter (){
	name = "Max Mustermann";
    }
    
    public String getInfoPerson(){
        return "Name: " + name;
    }
}

