public class Tagesabschnitt {

    /**
     * Retourniere Tagesabschnitt abhängig von der Uhrzeit
     * <p>
     * 6-9 (exkl.) -> Früh
     * 9-12 (exkl.) -> Vormittag
     * 12-16 (exkl.) -> Nachmittag
     * 16-20 (exkl.) -> Abend
     * 20-6 (exkl.) -> Nacht
     *
     * @param args Programmargumente (nicht verwendet)
     */
    public static void main(String[] args) {

        int uhrzeit = 11;

        String abschnitt = getTagesabschnitt(uhrzeit);

        System.out.println("abschnitt = " + abschnitt);
    }

    public static String getTagesabschnitt(int uhrzeit) {
        String abschnitt;

        if (uhrzeit < 6 || uhrzeit >= 20) {
            abschnitt = "Nacht";
        } else if (uhrzeit < 9) {
            abschnitt = "Früh";
        } else if (uhrzeit < 12) {
            abschnitt = "Vormittag";
        } else if (uhrzeit < 16) {
            abschnitt = "Nachmittag";
        } else {
            abschnitt = "Abend";
        }

        return abschnitt;
    }
}
