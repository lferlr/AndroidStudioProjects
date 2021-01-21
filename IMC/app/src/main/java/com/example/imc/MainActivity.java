package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edtPeso, edtAltura;
EditText tvIMC, tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtPeso = (EditText)findViewById(R.id.txtPeso);
        edtAltura = (EditText)findViewById(R.id.txtAltura);

        edtPeso.setTextColor(Color.RED);
        edtAltura.setTextColor(Color.RED);
    }
    public void verificarIMC(View v) {
        //Devo declarar as variaveis que trabalhar no IMC = peso/(altura*altura)
        tvIMC = (TextView)findViewById(R.id.txtIMC);
        tvResultado = (TextView)findViewById(R.id.txtResultado);

        double peso, altura, imc;
        peso = Double.parseDouble(edtPeso.getText().toString());
        altura = Double.parseDouble(edtAltura.getText().toString());
        imc = (peso/(altura*altura));

        if (imc<18.5){
            tvResultado.setText("A pessoa está magra!!!");
        } else if (imc<=25) {
            tvResultado.setText("A pessoa está com peso normal!!!");
        } else if (imc<=30) {
            tvResultado.setText("A pessoa está com sobrepeso!!!");
        } else {
            tvResultado.setText("A pessoa está obesa!!");
        }

        tvIMC.setText(String.valueOf(imc));
    }
}
