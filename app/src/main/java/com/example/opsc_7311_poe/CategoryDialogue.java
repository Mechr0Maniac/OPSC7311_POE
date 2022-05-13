package com.example.opsc_7311_poe;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialogFragment;

public class CategoryDialogue extends AppCompatDialogFragment {
    public interface CategoryBoxListener{
        void passAlong(String CatName, Integer CatGoals);
    }
    private EditText catName;
    private EditText catGoals;
    private CategoryBoxListener listener;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder catBuild = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.category_dialogue,null);

        catBuild.setView(view).setTitle("Create New Category").setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (catName.getText().toString().isEmpty() || catGoals.getText().toString().isEmpty()){
                    Toast.makeText(getActivity(),"Please fill in all info", Toast.LENGTH_SHORT).show();
                }else {
                    String CatName = catName.getText().toString();
                    Integer CatGoals = Integer.parseInt(catGoals.getText().toString());
                    listener.passAlong(CatName,CatGoals);
                }
            }
        });

        catName = view.findViewById(R.id.edtCatNam);
        catGoals = view.findViewById(R.id.edtCatGoal);

        return catBuild.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try {
            listener = (CategoryBoxListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString() + "must implement CategoryBoxListener");
        }
    }
}
