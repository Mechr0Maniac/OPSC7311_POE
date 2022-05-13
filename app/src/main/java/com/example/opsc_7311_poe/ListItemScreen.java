package com.example.opsc_7311_poe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.util.ArrayList;

public class ListItemScreen extends AppCompatActivity {


    EditText input;
    ListView listView;
    public static int AmountofDate = 1;

    // Initializing a new String Array
    String[] ItemName = new String[]{ "Date Issued"

    };
    String[] itemDescription = new String[]{"Description"
    };

    int[] itemImages = {R.drawable.android};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item_screen);

        //Get reference of widgets from XML layout
       //input = findViewById(R.id.input);//
        listView = findViewById(R.id.listview);//

        Button AddItem = (Button) findViewById(R.id.add_item_btn);

        ItemAdapter itemAdapter = new ItemAdapter(this, ItemName, itemImages, itemDescription);
        listView.setAdapter(itemAdapter);

        // DataBind ListView with items from ArrayAdapter


        AddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddItemScreen();
            }
        });

    }
    public void openAddItemScreen()
    {
        Intent intent = new Intent(this,AddItemScreen.class);
        startActivity(intent);
    }
}
