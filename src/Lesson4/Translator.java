package Lesson4;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.Scanner;

public class Translator {
    public static final String ENCODING = "UTF-8";

    protected static final String COLD = "холодно";
    protected static final String WARM = "тепло";
    protected static final String HOT = "жарко";
    protected static final String FROSTY = "морозно";
    protected static final String SUNNY = "солнечно";
    protected static final String CLEAR = "ясно";
    protected static final String STUFFY = "душно";
    protected static final String CLOUDY = "облачно";
    protected static final String WINDY = "ветрено";
    protected static final String DRY = "сухо";

    public static void main(String[] args) throws UnsupportedEncodingException {
        PrintStream printStream = new PrintStream(System.out, true, ENCODING);
        Scanner in = new Scanner(System.in);

        printStream.print("Input a word: ");
        String word = in.next().toLowerCase(Locale.ROOT);

        try {
            printStream.println("Translation is " + getTranslation(word));
        } catch (Exception e) {
            printStream.println(e.getMessage());
        }
    }

    protected static String getTranslation(String word) throws Exception {
        return switch (word) {
            case COLD -> "cold";
            case WARM -> "warm";
            case HOT -> "hot";
            case FROSTY -> "frosty";
            case SUNNY -> "sunny";
            case CLEAR -> "clear";
            case STUFFY -> "stuffy";
            case CLOUDY -> "cloudy";
            case WINDY -> "windy";
            case DRY -> "dry";
            default -> throw new Exception("Word was not found");
        };
    }
}
