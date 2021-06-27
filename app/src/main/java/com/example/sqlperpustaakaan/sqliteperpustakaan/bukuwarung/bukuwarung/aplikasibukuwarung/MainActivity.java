package com.example.sqlperpustaakaan.sqliteperpustakaan.bukuwarung.bukuwarung.aplikasibukuwarung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edusername,edpassword;
    Button btmasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edusername = (EditText)findViewById(R.id.edusername);
        edpassword = (EditText)findViewById(R.id.edpassword);

    }

    public void usergoogle(View view) {
        Toast.makeText(this, "Selamat anda login", Toast.LENGTH_LONG).show();
    }

    public void userGmail(View view) {
        Toast.makeText(this, "Selamat anda login", Toast.LENGTH_SHORT).show();
    }
}