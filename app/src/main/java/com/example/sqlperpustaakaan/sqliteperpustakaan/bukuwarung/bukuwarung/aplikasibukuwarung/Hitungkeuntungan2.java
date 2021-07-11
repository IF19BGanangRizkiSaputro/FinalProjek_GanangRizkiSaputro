package com.example.sqlperpustaakaan.sqliteperpustakaan.bukuwarung.bukuwarung.aplikasibukuwarung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Hitungkeuntungan2 extends AppCompatActivity {
    TextView untung , hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitungkeuntungan2);
        untung= (findViewById(R.id.untung));
        hasil = (findViewById(R.id.hasil));



    }
}