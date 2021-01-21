package com.example.componentesandroid;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SeekBarActivity extends AppCompatActivity {
    SeekBar skbVolume;
    TextView tvVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        skbVolume = (SeekBar)findViewById(R.id.seekBarVolume);
        tvVolume = (TextView)findViewById(R.id.lblVolume);

        skbVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tvVolume.setText("Volume: " +i); //Onde o i é o valor do volume...
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "seekBar touch iniciado", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "seekBar touch finalizado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

