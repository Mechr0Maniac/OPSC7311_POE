package com.example.opsc_7311_poe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class CollectionsActivity extends AppCompatActivity implements CategoryDialogue.CategoryBoxListener{

    private Integer numOfCats;
    private GridView catGrid;
    private List<MakeCat> cats = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections);

        Button addNewCat = findViewById(R.id.btnCreateCat);
        catGrid = findViewById(R.id.grdCatDisp);
        numOfCats = 0;

        addNewCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CategoryDialogue dialogue = new CategoryDialogue();
                dialogue.show(getSupportFragmentManager(), "Categories");
            }
        });
    }

    @Override
    public void passAlong(String CatName, Integer CatGoals){
        MakeCat cat = new MakeCat(numOfCats,CatName,CatGoals);
        cats.add(cat);
        numOfCats++;
        CatButtCreate buttCreate = new CatButtCreate(cats);
        catGrid.setAdapter(buttCreate);
    }
}