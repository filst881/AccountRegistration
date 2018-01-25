package com.example.fille.accountregistration;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
    dateValidator dtValidator;
    field fieldgenPass;
    field fieldgenUs;
    field fieldgenFull;
    field fieldgenEmail;
    field fieldgenDate;
    EditText date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        fieldGenerator fg = new fieldGenerator(this);
        setContentView(fg);
        editTextPass = new EditText(this);
        editTextUs = new EditText(this);
        editTextFull = new EditText(this);
        editTextEmail = new EditText(this);
        button = new Button(this);
        fg.setOrientation(LinearLayout.VERTICAL);
        param = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        button.setLayoutParams(param);
        button.setText("Registrera");
        editTextPass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        editTextEmail.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        date = new EditText(this);
        date.setInputType(InputType.TYPE_CLASS_NUMBER);


        pwValidator = new passwordValidator();
        usValidator = new usernameValidator();
        fnValidator = new fullNameValidator();
        emailValidator = new emailValidator();
        dtValidator = new dateValidator();
        fieldgenPass = new field("password", editTextPass, this, pwValidator);
        fieldgenUs = new field("Username", editTextUs, this, usValidator);
        fieldgenFull = new field("Full Name", editTextFull, this, fnValidator);
        fieldgenEmail = new field("Email", editTextEmail, this, emailValidator);
        fieldgenDate = new field("Date", date, this, dtValidator);

        fg.addField(fieldgenUs);
        fg.addField(fieldgenPass);
        fg.addField(fieldgenFull);
        fg.addField(fieldgenEmail);
        fg.addField(fieldgenDate);



        final Context context = this;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(fieldgenPass.isFilled && fieldgenUs.isFilled && fieldgenFull.isFilled && fieldgenEmail.isFilled && fieldgenDate.isFilled){

                    Toast.makeText(context, "Det är ok", Toast.LENGTH_SHORT).show();

                }else{

                    Toast.makeText(context, "Dt är inte ok", Toast.LENGTH_SHORT).show();
                }

            }
        });

        fg.addView(button);
       // fg.addField(new andersField());
    }
    /*public class andersField extends field{
        public andersField(Context c){
            super(c)
        }
    } */
}
