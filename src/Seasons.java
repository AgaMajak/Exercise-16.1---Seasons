import java.util.Arrays;

public enum Seasons {
    SPRING("Wiosna", months = new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", months = new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("Jesień", months = new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("Zima", months = new String[]{"grudzień", "styczeń", "luty"});


    private static String[] months;
    private String polishTranslation;

    Seasons(String polishTranslation, String[] months) {
        this.polishTranslation = polishTranslation;
    }

    public static Seasons fromPolishTranslation(Seasons[] seasons, String seasonToTranslate) {
        for (Seasons season : seasons) {
            if (seasonToTranslate.equalsIgnoreCase(season.getPolishTranslation())) {
                return season;
            }
        }
        return null;
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
