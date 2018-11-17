package Vererbung;

/**
 * Beispiel 04: Auto.java
 * @author Mutz
 */
class Auto {
    double geschwindigkeit = 0; // Initialwert: 0
    
    void fahre_los()  {
        geschwindigkeit = 50;
        
      
    }

    void halte_an() {
        geschwindigkeit = 0;
    }

    public static void main(String[] args) {
        Auto meinAuto = new Auto(); // erzeuge neues (stehendes) Auto
        meinAuto.fahre_los();       // jetzt fährt das Auto 100
        meinAuto.halte_an();        // jetzt steht das Auto wieder
        
        meinAuto.geschwindigkeit = 50; // jetzt fährt das Auto 100
        meinAuto.geschwindigkeit = 0;   // jetzt steht das Auto wieder

    }
}

