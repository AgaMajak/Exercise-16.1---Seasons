import java.util.Arrays;

public enum Seasons {
    SPRING("Wiosna", monthsInSpring = new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", monthsInSummer = new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("Jesień", monthsInAutumn = new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("Zima", monthsInWinter = new String[]{"grudzień", "styczeń", "luty"});


    private static String[] monthsInSpring;
    private static String[] monthsInSummer;
    private static String[] monthsInAutumn;
    private static String[] monthsInWinter;
    private String polishTranslation;
    private String[] months;


    Seasons(String polishTranslation, String[] months) {
        this.polishTranslation = polishTranslation;
        this.months = months;
    }

    public String getPolishTranslation() {
        return polishTranslation;
    }

    public String[] getMonths() {
        return months;
    }

    @Override
    public String toString() {
        return polishTranslation + " - miesiące wchodzące w skład tej pory roku to: " + Arrays.toString(months);
    }
}
