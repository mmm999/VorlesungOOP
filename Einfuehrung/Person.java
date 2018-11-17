package Einfuehrung;

public class Person {
    int   alter;
    float groesse;
    
    boolean vergleichePersonen(Person p){
	return (p.alter == alter)? true : false;
    }
    
    public static void main(String[] args) {
        Person personA = new Person();
        Person personB = new Person();

        personA.alter = 42;
        personA.groesse = 1.81f;
        personB.alter = 45;
        personB.groesse = 1.8f;
        
        if(personA.vergleichePersonen(personB))
            System.out.println("gleich");
        else
            System.out.println("ungleich");
    }
}
