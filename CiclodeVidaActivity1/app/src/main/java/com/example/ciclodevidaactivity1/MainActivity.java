package com.example.ciclodevidaactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSaudacao;
    TextView tvSaudacao;
    EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaudacao = (Button)findViewById(R.id.cmdSaudacao);
        tvSaudacao = (TextView)findViewById(R.id.txtSaudacao);
        edtNome = (EditText)findViewById(R.id.txtNome1);
        btnSaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSaudacao.setText("Seja Bem vindo!" + edtNome.getText());
            }
        });
        Log.i("Ciclo de vida", "Método onCreate acionado");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo de vida", "Método onStart acionado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ciclo de vida", "Método onResume acionado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ciclo de vida", "Método onRestart acionado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ciclo de vida", "Método onPause acionado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ciclo de vida", "Método onStop acionado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ciclo de vida", "Método onDestroy acionado");
    }
}
