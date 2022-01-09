package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;

public class MyFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_fragment);

        getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new LoginFragment()).commit();
    }
}