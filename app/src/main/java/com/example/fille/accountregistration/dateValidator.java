package com.example.fille.accountregistration;

import java.util.ArrayList;

/**
 * Created by fille on 2018-01-07.
 */

public class dateValidator implements Validator {
    @Override
    public boolean isValid(String input) {
        boolean valid = false;

        if(input.matches("\\d{2}((((0[13579])|(1[02]))(([0-2]\\d)|(3[01])))|(((0[469])|(11))([0-2]\\d|30))|(02[0-2]\\d))")){
            valid = true;
        }

        return valid;
    }


}
