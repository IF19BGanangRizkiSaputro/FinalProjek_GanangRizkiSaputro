package com.example.sqlperpustaakaan.sqliteperpustakaan.bukuwarung.bukuwarung.aplikasibukuwarung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungKeuntungan extends AppCompatActivity {

        EditText bil1, bil2;
        TextView hasil;
        Button kurang;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_hitung_keuntungan);

            bil1 = (EditText) findViewById(R.id.bil1);
            bil2 = (EditText) findViewById(R.id.bil2);
            kurang = (Button) findViewById(R.id.kurang);
            hasil = (TextView) findViewById(R.id.hasil);

            kurang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Double a = Double.parseDouble(bil1.getText().toString());
                    Double b = Double.parseDouble(bil2.getText().toString());
                    Double result = a - b;
                    hasil.setText(Double.toString(result));
                }
            });


        }
    }


