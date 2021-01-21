package com.example.exemplodatapicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatePicker dtData;
    Button btnData;
    TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvData = (TextView) findViewById(R.id.txtData);
        dtData = (DatePicker) findViewById(R.id.dataPickerExemplo);
        btnData = (Button) findViewById(R.id.cmdData);
        btnData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvData.setText("Data selecionada: " + dtData.getDayOfMonth() + "/" + (dtData.getMonth()+1) + "/" + dtData.getYear());
            }
        });

    }
}