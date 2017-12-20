package com.example.fille.accountregistration;

/**
 * Created by fille on 2017-12-19.
 */

public class usernameValidator implements Validator {
    @Override
    public boolean isValid(String input) {
        boolean valid = false;

        if(input.matches("[a-z|A-Z|0-9]+") && input.length() > 4){
            valid = true;
        }

        return valid;
    }
}
