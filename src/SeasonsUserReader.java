import java.util.Scanner;

public class SeasonsUserReader {

    public static void readSeasonFromUser() {
        Seasons[] seasons = Seasons.values();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informacje o jakiej porze roku chcesz wyświetlić? Wpisz: wiosna/lato/jesień/zima");
        String userSeason = scanner.nextLine();
        scanner.close();
        Seasons season = Seasons.fromPolishTranslation(seasons, userSeason);
        if (season == null) {
            System.out.println("Błędnie podana nazwa pory roku, spróbuj ponownie.");
        } else {
            System.out.println(season);
        }
    }
}
