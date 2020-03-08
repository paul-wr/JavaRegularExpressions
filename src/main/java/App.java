package main.java;

import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        // escaping
        isValid("\\(test\\)", "(test)");

        // wildcard test
        isValid("a...eg", "abcdefg");
        isValid("a...e.g", "abcdefg");
    }

    private static void isValid(String regex, String text){
        // Pattern.compile when there is a performance hit from string.matches(), as it needs to compile every time
        Pattern regexPattern = Pattern.compile(regex);
        boolean isValid = Pattern.matches(String.valueOf(regexPattern), text);
        System.out.printf("%s matches %s = %b\n", text, regex, isValid);
    }
}
