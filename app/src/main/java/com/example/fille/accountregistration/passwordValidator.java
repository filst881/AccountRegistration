package com.example.fille.accountregistration;

/**
 * Created by fille on 2017-12-19.
 */

public class passwordValidator implements Validator {
    @Override
    public boolean isValid(String input) {
        boolean valid = false;

        if(input.length() > 6){
            valid = true;
        }

        return valid;
    }
}
