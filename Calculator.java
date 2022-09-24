public class Calculator {

    public static void main(String[] args) {

        /*// Variablen deklarieren und initialisieren
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
        System.out.println("Ergebnis2: " + (p1 + p2));*/

        int a = 1;
        int b = 2;
        int ergebnis = add(a,b);
        System.out.println("ergebnis = " + ergebnis);
        System.out.println("subtrahieren: " + sub(2, 0));
        int result = power(2);
        System.out.println(div(2,0.0));
    }

    public static int add(int input1, int input2) {
        int result = input1 + input2;
        return result;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static double div(int a, double b) {
        if (b == 0) {
            System.out.println("Durch 0 kann nicht dividiert werden");
            return 0;
        }
        double result = a / b;
        return result;
    }

    public static int power(int a) {
        int result = a * a;
        return result;
    }
}
