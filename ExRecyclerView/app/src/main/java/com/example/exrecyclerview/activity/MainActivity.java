package com.example.exrecyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.exrecyclerview.R;
import com.example.exrecyclerview.adapter.Adapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView rclyViewFilmes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rclyViewFilmes = findViewById(R.id.recyclerViewFilmes);
        Adapter adapter = new Adapter();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rclyViewFilmes.setLayoutManager(layoutManager);
        rclyViewFilmes.setHasFixedSize(true);
        rclyViewFilmes.setAdapter(adapter);


}