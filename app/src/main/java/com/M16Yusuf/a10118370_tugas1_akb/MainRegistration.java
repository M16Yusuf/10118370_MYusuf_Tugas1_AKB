package com.M16Yusuf.a10118370_tugas1_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Nama : Muhammad Yusuf
//Kelas: IF-9
//NIM  : 10118370
//Tanggal : 8 April 2021


public class MainRegistration extends AppCompatActivity {

    private Button daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_registration);
        daftar = findViewById(R.id.btnReg);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainRegistration.this, MainLogin.class);
                startActivity(intent);
            }
        });

    }
}