package com.example.opsc_7311_poe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.btnEnt);
        Button reg = findViewById(R.id.btnReg);
        EditText use = findViewById(R.id.edtUse);
        EditText pas = findViewById(R.id.edtPas);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sUse = use.getText().toString();
                String sPas = pas.getText().toString();

                if(sUse.equals("Me") && sPas.equals("555")){
                    Intent collect = new Intent(MainActivity.this,CollectionsActivity.class);
                    startActivity(collect);
                }
                else {
                    Toast.makeText(MainActivity.this,"Please check login details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}