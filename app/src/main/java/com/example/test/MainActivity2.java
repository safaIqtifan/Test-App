package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import com.example.test.model.Student;
import com.example.test.model.User;

public class MainActivity2 extends AppCompatActivity {

    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        go = findViewById(R.id.btn);

        go.setOnClickListener(v -> {

                    Student s = new Student(5, "safa", 80.5);
                    User r = new User(5, "safa", "123ss");

                    Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                    i.putExtra("id", 659);
                    i.putExtra("userName", "Safa");
                    i.putExtra("isActive", true);

                    i.putExtra("Student", s);
                    i.putExtra("User", r);

                    startActivity(i);
                }
                );
    }
}