package com.example.favouritedictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText tiet_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tiet_password = findViewById(R.id.tiet_password);
        tiet_password.setBackgroundResource(android.R.color.transparent);
        tiet_password.setBackgroundResource(R.drawable.login_edt_bck);
    }
}