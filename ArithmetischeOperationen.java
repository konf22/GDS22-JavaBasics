public class ArithmetischeOperationen {

    //erzeugen mit /** ... */

    /**
     * Ausführung aller arithmetischer Operationen und Ausgabe
     *
     * @param args
     */
    public static void main(String[] args) {

        // deklarieren und initialisieren
        int a = 3;
        int b = 2;
        int result;

        // addieren
        result = a + b;
        System.out.println("result addition = " + result);

        // subtrahieren
        result = a - b;
        System.out.println("result subtraktion= " + result);

        // multiplizieren
        System.out.println("Multiplikation: " + (a * b));

        // dividieren
        // typumwandlung von int auf double
        double div = a / (1.0 * b);
        System.out.println("dividieren double: " + div);

        // Restwert - Modulo
        result = a % b;
        System.out.println("result modulo = " + result);

        // a++ => bedeutet a = a + 1
        System.out.println("a++");
        // ich erwarte mir 3
        System.out.println(a++);
        System.out.println("a = " + a); // ich erwarte mir 4

        // ++b
        System.out.println("++b");
        System.out.println(++b); // ich erwarte mir 3
        System.out.println("b = " + b); // ich erwarte mir 3
    }
}
