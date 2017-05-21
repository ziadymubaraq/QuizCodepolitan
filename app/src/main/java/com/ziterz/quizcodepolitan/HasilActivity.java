package com.ziterz.quizcodepolitan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView skorTeks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        int skor = getIntent().getIntExtra("SKOR", 0);

        skorTeks = (TextView) findViewById(R.id.nilai_skor);

        skorTeks.setText(skor+"");

    }
}
