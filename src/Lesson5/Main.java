package Lesson5;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку: ");
        String s1 = reader.readLine();
        // System.out.println(getLongest(s1));
        // System.out.println(getPalindrom(s1));
        // System.out.println(makeCens(s1));
         System.out.println(getSub(s1));
        // System.out.println(getRev(s1));
    }

    private static String getLongest(String string1) {
        String result = "";
        String word = "";
        int length = 0;
        String[] words = string1.split(" ");
        for (int i = 0; i < words.length; i++) {
            word = words[i];
            if (word.length() > length) {
                length = word.length();
                result = word;
            }
        }
        return result;
    }

    private static Boolean getPalindrom(String string) {
        Boolean result = false;
        StringBuilder builder = new StringBuilder(string);
        result = (builder.toString().toLowerCase(Locale.ROOT).equals(builder.reverse().toString().toLowerCase(Locale.ROOT)));
        return result;
    }

    private static String makeCens(String string) {
        String result = "";
       /* String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("бяка")) {
                words[i] = "[вырезано цензурой]";
            }
            result = result + words[i] + " ";
        }*/
        result = string.replace("бяка", "[вырезано цензурой]");

        return result;
    }

    private static String getSub(String string) throws IOException {
        String result = "Не содержит подстроку.";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите подстроку: ");
        String s2 = reader.readLine();
        int stringLength = string.length();
        int s2Length = s2.length();
        int withOutS2 = 0;
        if (string.contains(s2)) {
            withOutS2 = string.length()-string.replace(s2, "").length();
            result = (withOutS2 / s2Length) + " раз(а) содержит подстроку";
        }


        return result;
    }

    private static String getRev(String string) {
        String result = "";
        String[] words = string.split(" ");
        StringBuilder builder;
        for (int i = 0; i < words.length; i++) {
            builder = new StringBuilder(words[i]);
            result = result + builder.reverse().toString() + " ";
        }
        return result;
    }
}
