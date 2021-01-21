package com.example.exemplodatapickeredittext;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.time.DayOfWeek;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePickerDialog pickerData;
    TextView tvDataSelecionada;
    EditText edtData;
    Button btnData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDataSelecionada = (TextView)findViewById(R.id.lblDataSelecionada);
        btnData = (Button)findViewById(R.id.cmdEnviar);
        edtData = (EditText)findViewById(R.id.txtData);
        edtData.setInputType(InputType.TYPE_NULL);
        edtData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendario = Calendar.getInstance();
                int dia = calendario.get(Calendar.DAY_OF_MONTH);
                int mes = calendario.get(Calendar.MONTH);
                int ano = calendario.get(Calendar.YEAR);

                //Configuração do data Picker Dialog
                pickerData = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int mesAno, int diaSemana) {
                        edtData.setText(diaSemana + "/" + (mesAno + 1) + "/" + year);
                        pickerData.show();
                    }
                },ano,mes,dia);
                pickerData.show();
            }
        });

    }
}