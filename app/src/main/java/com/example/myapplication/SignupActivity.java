package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void signup(View view) {
        Intent i =new Intent(this,NavActivity.class);
        startActivity(i);
    }

    public void main_activity(View view) {
        Intent i =new Intent(this,SellerLoginActivity.class);
        startActivity(i);
    }
}