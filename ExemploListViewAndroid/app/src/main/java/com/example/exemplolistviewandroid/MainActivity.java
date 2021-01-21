package com.example.exemplolistviewandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lstPaises;
    private String[] paises = {"Brasil", "Argentina","Paraguai", "Uruguai", "México", "Peru", "Bolivia", "Colombia", "Nicaragua","Venezuela", "EUA", "Russia", "França", "Italia", "Alemanha", "Portugal", "Espanha", "Holanda", "Dinamarca","Onduras", "Inglaterra", "Nova Zelandia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstPaises = findViewById(R.id.listFilme);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,paises
        );

        lstPaises.setAdapter(adaptador);

        lstPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String valorSelecionado = lstPaises.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, "Valor selecionado " + valorSelecionado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}