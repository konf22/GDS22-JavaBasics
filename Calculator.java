public class Calculator {

    public static void main(String[] args) {

        // Variablen deklarieren und initialisieren
        String name = "MyFirstCalculator";
        int p1 = 2;
        int p2 = 3;
        //int ergebnis;

        // addieren
        int ergebnis = p1 + p2;

        // STRG + ALT + v => variable erzeugen
        int ergebnis2 = p1 + p2;

        System.out.println("Mein Name ist: " + name);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("ergebnis = " + ergebnis);

        // soutv
        System.out.println("ergebnis2 = " + ergebnis2);

        // Berechnung des Ergebnisses bei aufruf von println
        System.out.println("Ergebnis2: " + (p1 + p2));
    }
}
