package com.M16Yusuf.a10118370_tugas1_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

//Nama : Muhammad Yusuf
//Kelas: IF-9
//NIM  : 10118370
//Tanggal : 8 April 2021

public class MainDashboard extends AppCompatActivity {

    private Button  profile;
    private Button Blogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_dashboard);
        profile = findViewById(R.id.ProfileAcc);
        Blogout = findViewById(R.id.logout);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDashboard.this, MainProfil.class);
                startActivity(intent);
            }
        });


        Blogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDashboard.this, MainLogin.class);
                startActivity(intent);
            }
        });

    }
}