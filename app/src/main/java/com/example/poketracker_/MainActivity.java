package com.example.poketracker_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText height;
    EditText weight;

    TextWatcher addMeasures = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String heightInput = height.getText().toString() + " m";
            String weightInput = weight.getText().toString() + " kg";
        }

        @Override
        public void afterTextChanged(Editable editable) {


        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint);
        //setContentView(R.layout.linear);
        //setContentView(R.layout.table);

        height = findViewById(R.id.height_editText);
        weight = findViewById(R.id.weight_editText);

        height.addTextChangedListener(addMeasures);
        weight.addTextChangedListener(addMeasures);


    }
}