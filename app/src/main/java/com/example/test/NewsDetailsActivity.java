package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.test.model.NewsModel;

public class NewsDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);

        Bundle bundle = getIntent().getExtras();
        NewsModel newsModel = bundle.getParcelable("news");

        final TextView textView = findViewById(R.id.tvDetails);
        textView.setText(newsModel.toString());

    }
}