package com.example.opsc_7311_poe;

import android.content.Intent;
import android.graphics.Color;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.activity.result.contract.ActivityResultContracts;

import java.util.List;
import java.util.Random;

public class CatButtCreate extends BaseAdapter {
    private List<MakeCat> cats;

    public CatButtCreate(List<MakeCat> cats) {
        this.cats = cats;
    }

    @Override
    public int getCount() {
        return cats.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_grid_design,parent,false);
        }else {
            view = convertView;
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parent.getContext(),MainActivity.class);
                intent.putExtra("CAT_ID",cats.get(position).getCatID());
                intent.putExtra("CAT_NAME",cats.get(position).getCatName());
                intent.putExtra("CAT_GOALS",cats.get(position).getCatGoals());
                parent.getContext().startActivity(intent);
            }
        });

        ((TextView) view.findViewById(R.id.catNames)).setText(cats.get(position).getCatName());
        Random col = new Random();
        int color = Color.argb(255,col.nextInt(255),col.nextInt(255),col.nextInt(255));
        view.setBackgroundColor(color);
        return view;
    }
}
