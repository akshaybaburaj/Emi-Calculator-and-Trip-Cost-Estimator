package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class tripcost extends AppCompatActivity {
    EditText etDistance,etPrice,etMileage,ctCost;
    private Button backtc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tripcost);

        etDistance=findViewById(R.id.etDistance);
        etPrice=findViewById(R.id.etPrice);
        etMileage=findViewById(R.id.etMileage);
        ctCost=findViewById(R.id.ctCost);

    }
    public void calCost(View v)
    {
        Double d,p,m,c;
        d=Double.parseDouble(etDistance.getText().toString());
        p=Double.parseDouble(etPrice.getText().toString());
        m=Double.parseDouble(etMileage.getText().toString());
        c=(p/m)*d;
        ctCost.setText("Rs. "+String.valueOf(c));

    }

}

