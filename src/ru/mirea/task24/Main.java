package ru.mirea.task24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String part = "(25[0-5]|2[0-4][0-9]|1\\d\\d|[1-9]?\\d)";
        String regex = part + "\\." + part + "\\." + part + "\\." + part;
        Pattern pattern = Pattern.compile(regex);

        String str = "255.255.255.0";
//        String str = "1300.6.7.8";
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
    }
}
