package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
    EditText etPrincipal,etInterest,etTime,etAmount,etEMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        etPrincipal=findViewById(R.id.etPrincipal);
        etInterest=findViewById(R.id.etInterest);
        etTime=findViewById(R.id.etTime);
        etAmount=findViewById(R.id.etAmount);
        etEMI=findViewById(R.id.etEMI);

    }
    public void calEmi(View v)
    {
        Double p,r,t,a,emi,rt;
        p=Double.parseDouble(etPrincipal.getText().toString());
        r=Double.parseDouble(etInterest.getText().toString());
        t=Double.parseDouble(etTime.getText().toString());
        rt=p*(r/100)*(t/12);
        a=p+rt;
        emi=a/t;
        etAmount.setText("Rs "+String.valueOf(a));
        etEMI.setText("Rs "+String.valueOf(emi));
    }
}
