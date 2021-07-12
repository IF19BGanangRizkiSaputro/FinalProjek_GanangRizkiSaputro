package com.example.sqlperpustaakaan.sqliteperpustakaan.bukuwarung.bukuwarung.aplikasibukuwarung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Transaksi extends AppCompatActivity {

    EditText etnamabarang,etjumlah,etdaftarharga,etbayar;
    Button bttotal,bthasil,btreset;
    TextView tv0,tvkembalian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi);
        etnamabarang=(EditText)findViewById(R.id.etnamabarang);
        etjumlah=(EditText)findViewById(R.id.etjumlah);
        etdaftarharga=(EditText)findViewById(R.id.etdaftarharga);
        etbayar=(EditText)findViewById(R.id.etbayar);

        bttotal=(Button) findViewById(R.id.bttotal);
        bthasil=(Button) findViewById(R.id.bthasil);
        btreset=(Button) findViewById(R.id.btreset);

        tv0 =(TextView) findViewById(R.id.tv0);
        tvkembalian=(TextView) findViewById(R.id.tvkembalian);

        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jumlahbarang,hargabarang,total;
                jumlahbarang=Double.valueOf(etjumlah.getText().toString().trim());
                hargabarang=Double.valueOf(etdaftarharga.getText().toString().trim());
                total=jumlahbarang*hargabarang;
                String total1=String.valueOf(total);
                tv0.setText(total1);

            }
        });
        bthasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bayar,totalharga,hasil;
                totalharga=Double.valueOf(tv0.getText().toString().trim());
                bayar=Double.valueOf(etbayar.getText().toString().trim());
                hasil=bayar-totalharga;
                String hasil1=String.valueOf(hasil);
                tvkembalian.setText(hasil1);
            }
        });
        btreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etnamabarang.setText("");
                etdaftarharga.setText("");
                etjumlah.setText("");
                etbayar.setText("");
                tv0.setText("");
                tvkembalian.setText("");

            }
        });

    }
}