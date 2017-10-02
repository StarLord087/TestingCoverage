package com.example.shekhar.testingcoverage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
EditText editTextkm, editTextmin;
    Button buttonfare;
  TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        editTextkm = (EditText) findViewById(R.id.etkm);
        editTextmin = (EditText) findViewById(R.id.etmin);
        buttonfare = (Button) findViewById(R.id.btnfare);
        textViewResult = (TextView) findViewById(R.id.tvresult);

        Float km = Float.parseFloat(editTextkm.getText().toString());
        int min = Integer.parseInt(editTextmin.getText().toString());


        buttonfare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewResult.setText(""+calfare(Float.parseFloat(editTextkm.getText().toString()), Integer.parseInt(editTextmin.getText().toString())));
            }
        });

    }

    public static float calfare(float km, int min){
        return 50+ ((km>5)?(km-5)*12:0 )+((min >15)?(min-15):0);
    }
}
