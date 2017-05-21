package com.ziterz.quizcodepolitan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    soal[] daftarSoal = {
            new soal(R.string.soal1, true),
            new soal(R.string.soal2, true),
            new soal(R.string.soal3, false)
    };

    TextView teksSoal;
    int indexSoal, skor;
    Button benar, salah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        indexSoal=0;
        teksSoal = (TextView) findViewById(R.id.soal);

        teksSoal.setText(daftarSoal[indexSoal].getSoal());

        benar = (Button) findViewById(R.id.benar);
        salah = (Button) findViewById(R.id.salah);

        benar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawaban(true);
            }
        });

        salah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawaban(false);
            }
        });
    }
    public void cekJawaban(boolean jawaban){
        if(jawaban == daftarSoal[indexSoal].isKunci()){
            skor = skor+10;
        }

        if(indexSoal == daftarSoal.length -1){
            Intent intent = new Intent(this, HasilActivity.class);
            intent.putExtra("SKOR",skor);
            startActivity(intent);
        }
        indexSoal = indexSoal+1;
        teksSoal.setText(daftarSoal[indexSoal].getSoal());
    }
}
