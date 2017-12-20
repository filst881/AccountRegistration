package com.example.fille.accountregistration;

/**
 * Created by fille on 2017-12-20.
 */

public class emailValidator implements Validator {


    @Override
    public boolean isValid(String input) {
        if(input.matches("[^@]+@[^@]+\\.[^@]+")){

            return true;
        }else

        return false;
    }
    }

