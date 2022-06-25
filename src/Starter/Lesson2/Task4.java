package Starter.Lesson2;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Task4 {
    public static final String ENCODING = "UTF-8";

    public static final char
            S1 = '\u0417',
            S2 = '\u0434',
            S3 = '\u0440',
            S4 = '\u0430',
            S5 = '\u0432',
            S6 = '\u0441',
            S7 = '\u0442',
            S8 = '\u0443',
            S9 = '\u0439',
            S10 = '\u0435',
            COMMA = '\u002C',
            SPACE = '\u0020',
            S11 = '\u0410',
            S12 = '\u043B',
            S13 = '\u043A',
            S14 = '\uu043D',
            EXCLAMATION_MARK = '\u0021';

    public static void main(String[] args) throws UnsupportedEncodingException {
        PrintStream printStream = new PrintStream(System.out, true, Task4.ENCODING);

        String hello = "" + S1 + S2 + S3 + S4 + S5 + S6 + S7 + S5 + S8 + S9 + S7 + S10;
        String separator = "" + COMMA + SPACE;
        String name = "" + S11 + S12 + S10 + S13 + S6 + S4 + S14 + S2 + S3 + SPACE + EXCLAMATION_MARK;

        printStream.println(hello + separator + name);
    }
}
