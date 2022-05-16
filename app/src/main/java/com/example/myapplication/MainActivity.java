package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<contactmodel> arrContacts = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.saifview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new contactmodel(R.drawable.plumber,"A","0987654321"));
        arrContacts.add(new contactmodel(R.drawable.plumber,"A","0987654321"));
        arrContacts.add(new contactmodel(R.drawable.plumber,"A","0987654321"));
        arrContacts.add(new contactmodel(R.drawable.plumber,"A","0987654321"));
        arrContacts.add(new contactmodel(R.drawable.plumber,"A","0987654321"));




    }
}