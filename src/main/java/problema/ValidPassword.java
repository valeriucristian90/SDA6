package problema;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {

    public static void main(String[] args) {

        String password = "t90word";

        atLeastTenCharacters(password);
        System.out.println(atLeastTenCharacters(password));
        onlyLettersAndDigits(password);
        System.out.println(onlyLettersAndDigits(password));
    }

    public static boolean atLeastTenCharacters(String password) {

        boolean hasMoreThanTen = true;
        int x = password.length();
        if (x >= 10) {
            hasMoreThanTen = false;
        } else {
            hasMoreThanTen = true;
        }

        return hasMoreThanTen;

    }

    public static boolean onlyLettersAndDigits(String password) {
        boolean result = false;
        for (int i = 0; i < password.length(); i++) {
            if (checkCharacter(password.charAt(i))) {
                result = true;
            }
        }
        return result;

    }

    private static boolean checkCharacter(char charAt) {
        boolean result = false;
        if ((charAt >= 'A') && (charAt <= 'Z') && (charAt >= 'a') && (charAt <= 'z') && (charAt >= '0') && (charAt <= '9')) {
            result = true;
        }
        return result;
    }
}
