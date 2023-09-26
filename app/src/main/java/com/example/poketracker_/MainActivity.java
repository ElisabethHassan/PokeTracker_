package com.example.poketracker_;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText height;
    EditText weight;
    private EditText nationalNum;
    private EditText name;
    private EditText species;
    private EditText hp;
    private EditText attack;
    private EditText defense;
    private TextView nationalNumLabel;
    private TextView nameLabel;
    private TextView speciesLabel;
    private TextView weightLabel;
    private TextView heightLabel;
    private TextView hpLabel;
    private TextView attackLabel;
    private TextView defenseLabel;
    private Spinner spinner;
    private Button saveButton;
    private Button resetButton;
    private Double hpText;
    private Double attackText;
    private Double defenseText;
    private Double heightText;
    private Double weightText;
    boolean isAllFieldsChecked = false;


    View.OnClickListener saveButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            isAllFieldsChecked = checkAllfields();

            if(isAllFieldsChecked){
                Toast.makeText(getApplicationContext(), "Successful save! The information was stored in the database", Toast.LENGTH_LONG);
            } else {
                Toast.makeText(getApplicationContext(), "Error occurred. Fix inputs in red", Toast.LENGTH_LONG).show();
            }

        }
    };

    View.OnClickListener resetButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            name.setText("Glastrier");
            species.setText("Wild Horse Pokémon");
            weight.setText("2.2");
            height.setText("800.0");
            hp.setText("0");
            attack.setText("0");
            defense.setText("0");
        }
    };

    AdapterView.OnItemSelectedListener spinListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            // adapterView.getSelectedItem(); //
            String message = adapterView.getItemAtPosition(i).toString();
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };
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
        //setContentView(R.layout.constraint);
        setContentView(R.layout.linear);
        //setContentView(R.layout.table);

        height = findViewById(R.id.height_editText);
        weight = findViewById(R.id.weight_editText);
        nationalNum = findViewById(R.id.national_editview);
        nationalNumLabel = findViewById(R.id.nationalLabel_tv);
        name = findViewById(R.id.name_editText);
        nameLabel = findViewById(R.id.nameLabel_tv);
        species = findViewById(R.id.species_editText);
        speciesLabel = findViewById(R.id.speciesLabel_tv);
        weight = findViewById(R.id.weight_editText);
        weightLabel = findViewById(R.id.weightLabel_tv);
        height = findViewById(R.id.height_editText);
        heightLabel = findViewById(R.id.heightLabel_tv);
        hp = findViewById(R.id.hp_editText);
        hpLabel = findViewById(R.id.hpLabel_tv);
        attack = findViewById(R.id.attack_editText);
        attackLabel = findViewById(R.id.attackLabel_tv);
        defense = findViewById(R.id.defense_editText);
        defenseLabel = findViewById(R.id.defenseLabel_tv);
        spinner = findViewById(R.id.spinner_box);
        resetButton = findViewById(R.id.button);
        saveButton = findViewById(R.id.save_button);


        height.addTextChangedListener(addMeasures);
        weight.addTextChangedListener(addMeasures);
        spinner.setOnItemSelectedListener(spinListener);
        resetButton.setOnClickListener(resetButtonListener);
        saveButton.setOnClickListener(saveButtonListener);


    }


    private boolean checkAllfields() {
//        hpText = Double.parseDouble(hp.getText().toString());
//        attackText = Double.parseDouble(attack.getText().toString());
//        defenseText = Double.parseDouble(defense.getText().toString());
//        heightText = Double.parseDouble(height.getText().toString());
//        weightText = Double.parseDouble(weight.getText().toString());

        //String nameText = name.getText().toString();
        //3 <= name.length() && name.length() <= 12
        if (3 > name.length() || name.length() > 12){
            nameLabel.setTextColor(Color.RED);
            return false;
        }

        //String hpStringtext = editText.getText().toString();
        //1 <=  hpText && hpText <= 362
//        if (1 >  hpText || hpText > 362){
//            hpLabel.setTextColor(Color.RED);
//            return false;
//        }
//
//        //5 <=  attackText && attackText <= 526
//        if (5 >  attackText || attackText > 526){
//            attackLabel.setTextColor(Color.RED);
//            return false;
//        }
//
//        //5 <=  defenseText && defenseText <= 614
//        if (5 >  defenseText || defenseText > 614){
//            defenseLabel.setTextColor(Color.RED);
//            return false;
//        }
//
//        //0.3 <=  heightText && heightText <= 19.99
//        if (0.3 >  heightText || heightText > 19.99){
//            heightLabel.setTextColor(Color.RED);
//            return false;
//        }
//
//        //0.1 <=  weightText && weightText <= 820.0
//        if (0.1 >  weightText || weightText > 820.0){
//            weightLabel.setTextColor(Color.RED);
//            return false;
//        }

        return true;



    }

}