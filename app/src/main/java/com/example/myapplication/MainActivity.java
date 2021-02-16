package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signup(View view) {
        Intent i =new Intent(this,CustomerLoginActivity.class);
        startActivity(i);
    }

    public void main_activity(View view) {
        Intent i=new Intent(this,SellerLoginActivity.class);
        startActivity(i);
    }

    public void signup1(View view) {
        Intent i =new Intent(this,SignupActivity.class);
        startActivity(i);
    }
}