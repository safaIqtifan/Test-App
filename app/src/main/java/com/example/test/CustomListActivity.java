package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.test.Adapter.StudentAdapter;
import com.example.test.model.StudentData;

import java.util.ArrayList;

public class CustomListActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        list = findViewById(R.id.listView);
        ArrayList<StudentData> data = new ArrayList<>();
        StudentData s1 = new StudentData(1,"facebook",R.drawable.facebook);
        StudentData s2 = new StudentData(2,"twitter",R.drawable.twitter);
        StudentData s3 = new StudentData(3,"youtube",R.drawable.youtube);
        StudentData s4 = new StudentData(4,"facebook",R.drawable.facebook);
        StudentData s5 = new StudentData(5,"twitter",R.drawable.twitter);
        StudentData s6 = new StudentData(6,"youtube",R.drawable.youtube);

        data.add(s1);
        data.add(s2);
        data.add(s3);
        data.add(s4);
        data.add(s5);
        data.add(s6);

        StudentAdapter studentAdapter = new StudentAdapter(this,data);
        list.setAdapter(studentAdapter);
    }
}