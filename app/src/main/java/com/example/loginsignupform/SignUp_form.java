package com.example.loginsignupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SignUp_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_form);
        getSupportActionBar().setTitle("Sign up form");
    }
}