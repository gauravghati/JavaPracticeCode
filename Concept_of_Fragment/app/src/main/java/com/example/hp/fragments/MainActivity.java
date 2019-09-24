package com.example.hp.fragments;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected{

    TextView tvDescription;
   String[] database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDescription = findViewById(R.id.tvDescription);
        database = getResources().getStringArray(R.array.descriptions);

        if(findViewById(R.id.layout_portrait)!= null)
        {
            android.support.v4.app.FragmentManager manager = this.getSupportFragmentManager();
            manager.beginTransaction().hide(manager.findFragmentById(R.id.DetailFragid))
                    .show(manager.findFragmentById(R.id.ListFragid)).commit();
        }
        else if(findViewById(R.id.layout_land)!=null)
        {
            android.support.v4.app.FragmentManager manager = this.getSupportFragmentManager();
            manager.beginTransaction().show(manager.findFragmentById(R.id.DetailFragid))
                    .show(manager.findFragmentById(R.id.ListFragid)).commit();
        }
    }

    @Override
    public void onItemSelected(int index) {

        tvDescription.setText(database[index]);
        if(findViewById(R.id.layout_portrait)!=null)
        {
            android.support.v4.app.FragmentManager manager = this.getSupportFragmentManager();
            manager.beginTransaction().show(manager.findFragmentById(R.id.DetailFragid)).addToBackStack(null)
                    .hide(manager.findFragmentById(R.id.ListFragid)).commit();
        }
    }
}
