import java.util.Scanner;

public class SeasonsUserReader {

    public static void readSeasonFromUser() {
        Seasons[] seasons = Seasons.values();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informacje o jakiej porze roku chcesz wyświetlić? Wpisz: wiosna/lato/jesień/zima");
        String userSeason = scanner.nextLine();
        scanner.close();

        for (Seasons season : seasons) {
            if (userSeason.equalsIgnoreCase(season.getPolishTranslation())) {
                System.out.println(season);
                return;
            }
        }

        System.out.println("Błędnie podana nazwa pory roku, spróbuj ponownie.");
    }
}
