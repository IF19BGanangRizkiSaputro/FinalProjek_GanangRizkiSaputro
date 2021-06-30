package com.example.sqlperpustaakaan.sqliteperpustakaan.bukuwarung.bukuwarung.aplikasibukuwarung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    EditText edusername, edpassword;
    Button btmasuk;

    private FirebaseAuth mAuth;
    private String ContactId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();

        edusername = (EditText) findViewById(R.id.edusername);
        edpassword = (EditText) findViewById(R.id.edpassword);
        btmasuk=(Button)findViewById(R.id.btmasuk);
        btmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, menu_transaksi.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);

    }

    private void updateUI(FirebaseUser currentUser) {
    }

    public void userGmail(View view) {
    }

    public void usergoogle(View view) {
    }
}