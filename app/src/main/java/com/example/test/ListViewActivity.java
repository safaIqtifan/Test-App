package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        list = findViewById(R.id.listView);
        ArrayList<String> data = new ArrayList<>();
        data.add("a");
        data.add("b");
        data.add("c");
        data.add("d");
        data.add("e");
        data.add("f");
        data.add("g");
        data.add("h");
        data.add("i");
        data.add("j");
        data.add("k");
        data.add("l");
        data.add("m");
        data.add("o");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(arrayAdapter);

        list.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(getApplicationContext(), data.get(position), Toast.LENGTH_SHORT).show();

        });

        list.setOnItemLongClickListener((parent, view, position, id) -> {
            Toast.makeText(getApplicationContext(), data.get(position) + "LONG", Toast.LENGTH_SHORT).show();
            return true;

        });
    }
}