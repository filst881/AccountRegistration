package com.example.fille.accountregistration;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by fille on 2017-12-19.
 */

public class field {






    private Context context;
    private LinearLayout layout;
    private TextView validField;
    LinearLayout.LayoutParams parameter;
    LinearLayout.LayoutParams params;
    LinearLayout.LayoutParams param;
    private Validator validator;
    boolean isFilled;







    public field(Context context, Validator validator){
        this.context = context;
        this.validator = validator;
        layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        validField = new TextView(context);
        parameter = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT);
        param = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT);

        params.weight = 0.6f;
        param.weight = 0.2f;

    }

    public void addField(String fieldName, EditText editText){
        TextView text = new TextView(context);
        text.setText(fieldName);
        text.setLayoutParams(param);
        editText.setLayoutParams(params);
        validField.setLayoutParams(param);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(validator.isValid(editable.toString())){
                    validField.setBackgroundColor(Color.GREEN);
                    isFilled = true;
                }else{
                    validField.setBackgroundColor(Color.TRANSPARENT);
                    isFilled = false;
                }
            }
        });

        layout.setLayoutParams(parameter);
        layout.addView(text);
        layout.addView(editText);
        layout.addView(validField);

    }


    public LinearLayout getLayout() {
        return layout;
    }


    public void setValidField(boolean valid){
        if(valid){
            validField.setBackgroundColor(Color.GREEN);


        }
        else {
            validField.setBackgroundColor(Color.TRANSPARENT);

        }
    }
}
