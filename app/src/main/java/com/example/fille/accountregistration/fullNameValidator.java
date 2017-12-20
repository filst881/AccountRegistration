package com.example.fille.accountregistration;

/**
 * Created by fille on 2017-12-20.
 */

public class fullNameValidator implements Validator {


    @Override
    public boolean isValid(String input) {

        if(input.matches("[A-Z][a-z]+\\ [A-Z][a-z]+")){
            return true;
        }else

            return false;
    }
}
