package com.example.sqlperpustaakaan.sqliteperpustakaan.bukuwarung.bukuwarung.aplikasibukuwarung;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
@IgnoreExtraProperties
public class menu_transaksi extends AppCompatActivity implements Serializable {
    private FirebaseAuth mAuth;
    Button btsave,bttotal,bthasil;
    TextView tvnamabarang,tvjmlhbarangdibeli,tvdaftarharga,tv0,tvbayar,tvkembalian;
    EditText etnamabarang,etjumlah,etdaftarharga,etbayar;
    private Object GoogleCredentials;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_transaksi);
        mAuth = FirebaseAuth.getInstance();

        //Button
        bttotal = (Button)findViewById(R.id.bttotal);
        btsave =(Button)findViewById(R.id.btsave);
        bthasil =(Button)findViewById(R.id.bthasil);

        //EditTEXT
        etnamabarang=(EditText)findViewById(R.id.etnamabarang);
        etjumlah=(EditText)findViewById(R.id.etjumlah);
        etdaftarharga=(EditText)findViewById(R.id.etdaftarharga);
        etbayar=(EditText)findViewById(R.id.etbayar);

        //TextView
        tvnamabarang=(TextView)findViewById(R.id.tvnamabarang);
        tvjmlhbarangdibeli=(TextView)findViewById(R.id.tvjmlhbarangdibeli);
        tvdaftarharga =(TextView)findViewById(R.id.tvdaftarharga);
        tv0=(TextView)findViewById(R.id.tv0);
        tvbayar=(TextView)findViewById(R.id.tvbayar);
        tvkembalian=(TextView)findViewById(R.id.tvkembalian);

        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jumlahbarang,hargabarang,total;
                jumlahbarang=Double.valueOf(etjumlah.getText().toString().trim());
                hargabarang=Double.valueOf(etdaftarharga.getText().toString().trim());
                total=jumlahbarang *hargabarang;
                String total1= String.valueOf(total);
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
        btsave.setOnClickListener(new View.OnClickListener() {
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