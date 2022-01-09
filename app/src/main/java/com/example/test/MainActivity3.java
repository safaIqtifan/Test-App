package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.test.model.Student;
import com.example.test.model.User;

public class MainActivity3 extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        result = findViewById(R.id.result);

        Bundle bundle = getIntent().getExtras();

        int id = bundle.getInt("id");
        String userName = bundle.getString("userName");
        Boolean isActive = bundle.getBoolean("isActive");

        Student s = (Student) bundle.getSerializable("Student");
        User r = bundle.getParcelable("User");

        result.setText(id + " / "+ userName+ " / "+ isActive + s.toString() + " / "+ r.toString());

    }
}