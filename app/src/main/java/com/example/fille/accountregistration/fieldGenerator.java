package com.example.fille.accountregistration;

import android.content.Context;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by fille on 2017-12-19.
 */

public class fieldGenerator extends LinearLayout {

    EditText editTextPass;
    EditText editTextUs;
    EditText editTextFull;
    EditText editTextEmail;
    Button button;
    LinearLayout.LayoutParams param;
    passwordValidator pwValidator;
    usernameValidator usValidator;
    fullNameValidator fnValidator;
    emailValidator emailValidator;
    field fieldgenPass;
    field fieldgenUs;
    field fieldgenFull;
    field fieldgenEmail;


    public fieldGenerator(final Context context){
        super(context);

        editTextPass = new EditText(context);
        editTextUs = new EditText(context);
        editTextFull = new EditText(context);
        editTextEmail = new EditText(context);
        button = new Button(context);
        this.setOrientation(LinearLayout.VERTICAL);
        param = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        button.setLayoutParams(param);
        button.setText("Registrera");
        editTextPass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        editTextEmail.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);


        pwValidator = new passwordValidator();
        usValidator = new usernameValidator();
        fnValidator = new fullNameValidator();
        emailValidator = new emailValidator();
        fieldgenPass = new field(context, pwValidator);
        fieldgenUs = new field(context, usValidator);
        fieldgenFull = new field(context, fnValidator);
        fieldgenEmail = new field(context, emailValidator);


        fieldgenUs.addField("Username", editTextUs);
        fieldgenPass.addField("password", editTextPass);
        fieldgenFull.addField("Full Name", editTextFull);
        fieldgenEmail.addField("Email", editTextEmail);
        this.setLayoutParams(param);
        this.addView(fieldgenUs.getLayout());
        this.addView(fieldgenPass.getLayout());
        this.addView(fieldgenFull.getLayout());
        this.addView(fieldgenEmail.getLayout());


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(fieldgenPass.isFilled && fieldgenUs.isFilled && fieldgenFull.isFilled && fieldgenEmail.isFilled){

                    Toast.makeText(context, "Det är ok", Toast.LENGTH_SHORT).show();

                }else{

                    Toast.makeText(context, "Dt är inte ok", Toast.LENGTH_SHORT).show();
                }

            }
        });

        this.addView(button);


    }


    //editTextUs.setSingleLine();








    //LinearLayout.LayoutParams parm = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT );

    //editText.setLayoutParams(parm);










}
