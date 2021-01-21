package com.example.abriractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnAbrir, btnAbrir2, btnAbrir3, btnAbrir4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAbrir = (Button)findViewById(R.id.cmdAbrir);
        btnAbrir2 = (Button)findViewById(R.id.cmdAbrir2);
        btnAbrir3 = (Button)findViewById(R.id.cmdAbrir3);
        btnAbrir4 = (Button)findViewById(R.id.cmdAbrir4);

        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, SegundaActivity.class);
                startActivity(intent);
            }
        });

        btnAbrir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, TerceiraActivity.class);
                startActivity(intent);
            }
        });

        btnAbrir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, QuartaActivity.class);
                startActivity(intent);
            }
        });

        btnAbrir4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, QuintaActivity.class);
                startActivity(intent);
            }
        });
    }
}
