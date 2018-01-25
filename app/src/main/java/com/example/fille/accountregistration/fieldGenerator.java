package com.example.fille.accountregistration;

import android.content.Context;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by fille on 2017-12-19.
 */

public class fieldGenerator extends LinearLayout {

   /* EditText editTextPass;
    EditText editTextUs;
    EditText editTextFull;
    EditText editTextEmail;
    Button button;
    LinearLayout.LayoutParams param;
    passwordValidator pwValidator;
    usernameValidator usValidator;
    fullNameValidator fnValidator;
    emailValidator emailValidator;
    dateValidator dtValidator;
    field fieldgenPass;
    field fieldgenUs;
    field fieldgenFull;
    field fieldgenEmail;
    field fieldgenDate;
    EditText date; */



    public fieldGenerator(final Context context){
        super(context);

       /* editTextPass = new EditText(context);
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
        date = new EditText(context);
        date.setInputType(InputType.TYPE_CLASS_NUMBER);


        pwValidator = new passwordValidator();
        usValidator = new usernameValidator();
        fnValidator = new fullNameValidator();
        emailValidator = new emailValidator();
        dtValidator = new dateValidator();
        fieldgenPass = new field("password", editTextPass, context, pwValidator);
        fieldgenUs = new field("Username", editTextUs, context, usValidator);
        fieldgenFull = new field("Full Name", editTextFull, context, fnValidator);
        fieldgenEmail = new field("Email", editTextEmail, context, emailValidator);
        fieldgenDate = new field("Date", date, context, dtValidator);



        this.setLayoutParams(param);
        this.addView(fieldgenUs.getLayout());
        this.addView(fieldgenPass.getLayout());
        this.addView(fieldgenFull.getLayout());
        this.addView(fieldgenEmail.getLayout());
        this.addView(fieldgenDate.getLayout());

        */






    }


    public void addField(field fld){
        this.addView(fld.getLayout());
    }


    //editTextUs.setSingleLine();








    //LinearLayout.LayoutParams parm = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT );

    //editText.setLayoutParams(parm);










}
