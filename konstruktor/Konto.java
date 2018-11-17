package konstruktor;

/**
 * Beispiel 10: Konto.java
 * @author Mutz
 */

class Konto {
    int    kontonummer;
    double saldo;

    Konto() {
         System.out.println("Ein neues Konto wurde erzeugt.");
    }

    Konto(int kontonummer) {
	this();
	this.kontonummer = kontonummer;
        System.out.println("Test1");
    }

    Konto(int kontonummer, double saldo) {
	this(kontonummer);
	this.saldo = saldo;
        System.out.println("Test2");
    }
}

