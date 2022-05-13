package com.example.opsc_7311_poe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    private Button ListItembtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListItembtn = (Button) findViewById(R.id.ItemScreenBtn);
        ListItembtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openItemScreen();
            }
        });
    }
    public void openItemScreen()
    {
        Intent intent = new Intent(this,ListItemScreen.class);
        startActivity(intent);
    }
}