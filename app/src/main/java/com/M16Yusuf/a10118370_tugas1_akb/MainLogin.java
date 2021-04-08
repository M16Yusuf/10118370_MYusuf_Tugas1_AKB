package com.M16Yusuf.a10118370_tugas1_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//Nama : Muhammad Yusuf
//Kelas: IF-9
//NIM  : 10118370
//Tanggal : 8 April 2021

public class MainLogin extends AppCompatActivity {

    private Button login;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_login);

        login = findViewById(R.id.btnLogin);
        register = findViewById(R.id.btnRegister);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLogin.this, MainDashboard.class);
                startActivity(intent);
            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLogin.this, MainRegistration.class);
                startActivity(intent);
            }
        });
    }
}