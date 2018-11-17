package Vererbung;

/**
 * Beispiel 04: Auto.java
 * @author Mutz
 */
class AutoThread {
    double geschwindigkeit = 0; // Initialwert: 0
    
    void fahre_los() throws InterruptedException {
        //geschwindigkeit = 50;
        for (int i = 0; i < 50; i++) {
            geschwindigkeit+=1;
            Thread.sleep(100);
            System.out.println("GÄ: "+geschwindigkeit);
        }
    }

    void halte_an() {
        geschwindigkeit = 0;
    }

    public static void main(String[] args) throws InterruptedException {
        AutoThread meinAuto = new AutoThread(); // erzeuge neues (stehendes) Auto
        meinAuto.fahre_los();       // jetzt fährt das Auto 100
        meinAuto.halte_an();        // jetzt steht das Auto wieder
        
        meinAuto.geschwindigkeit = 50; // jetzt fährt das Auto 100
        meinAuto.geschwindigkeit = 0;   // jetzt steht das Auto wieder

    }
}

