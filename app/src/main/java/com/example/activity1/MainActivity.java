package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button btemi,bttrip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttrip = (Button) findViewById(R.id.bttrip);
        bttrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });


        btemi = (Button) findViewById(R.id.btemi);
        btemi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

public void openActivity2()
{

    Intent intent=new Intent(this,Activity2.class);
startActivity(intent);
}
    public void openActivity3()
    {

        Intent intent2=new Intent(this,tripcost.class);
      startActivity(intent2);
    }

}
