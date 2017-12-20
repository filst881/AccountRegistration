package com.example.fille.accountregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fille on 2017-12-19.
 */

public class passwordValidator implements Validator {
    @Override
    public boolean isValid(String input) {
        boolean valid = false;

        boolean hasUppercase = !input.equals(input.toLowerCase());
        boolean hasLowercase = !input.equals(input.toUpperCase());
        int strengthPoints = 0;
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);
        boolean b = m.find();


        if (b) {
            strengthPoints++;
        }

        if (hasLowercase) {
            strengthPoints++;
        }

        if (hasUppercase) {
            strengthPoints++;
        }

        if (input.matches(".*\\d+.*")) {
            strengthPoints++;
        }

        if (input.length() > 8) {
            strengthPoints++;
        }

        if (input.length() > 12) {
            strengthPoints++;
        }

        if (strengthPoints >= 5) {

            return true;

        } else {

            return false;

        }

    }
}
