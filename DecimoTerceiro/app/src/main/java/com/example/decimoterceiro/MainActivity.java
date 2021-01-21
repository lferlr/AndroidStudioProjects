package com.example.decimoterceiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtSalario, edtMeses;
    TextView tvResultFerias, tvDecTerceiro;
    Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSalario = (EditText)findViewById(R.id.txtSalario);
        edtMeses = (EditText)findViewById(R.id.txtDta);
        /*tvResultFerias = (TextView)findViewById(R.id.txtResultadoFerias);
        tvDecTerceiro = (TextView) findViewById(R.id.txtDecTerceiro);*/

        btnCalcular = (Button)findViewById(R.id.cmdCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String meses = edtMeses.getText().toString();
                String salario = edtSalario.getText().toString();

                Usuario usuario = new Usuario(meses, salario);

                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("objeto", usuario);
                startActivity(intent);
            }
        });
    }

    /*public void calcular(View v) {


        double meses, salario, ferias, dt;
        meses = Double.parseDouble(edtMeses.getText().toString());
        salario = Double.parseDouble(edtSalario.getText().toString());
        ferias = (double) salario + (salario / 3);
        dt = salario * (meses / 12);

        tvResultFerias.setText(String.valueOf(ferias));
        tvDecTerceiro.setText(String.valueOf(dt));
    }*/
}
