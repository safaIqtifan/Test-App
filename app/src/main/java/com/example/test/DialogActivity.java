package com.example.test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class DialogActivity extends AppCompatActivity {

    Button dialog, timePickerBtn, datePickerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        dialog = findViewById(R.id.dialogbtn);
        timePickerBtn = findViewById(R.id.timePickerBtn);
        datePickerBtn = findViewById(R.id.datePickerBtn);

        dialog.setOnClickListener(v -> {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Delete Message");
            builder.setMessage("Are you sure to delete message");
            builder.setCancelable(false);

            builder.setPositiveButton("Yes", (dialog1, which) -> {
                Toast.makeText(this, "Yes Button", Toast.LENGTH_SHORT).show();
            });

            builder.setNegativeButton("No", (dialog1, which) -> {
                Toast.makeText(this, "No Button", Toast.LENGTH_SHORT).show();
            });

            builder.setNeutralButton("Rate Me", (dialog1, which) -> {
                Toast.makeText(this, "Rate Button", Toast.LENGTH_SHORT).show();
            });

            builder.create().show();
        });

        timePickerBtn.setOnClickListener(v -> {

            Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR);
            int minute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    Toast.makeText(getApplicationContext(), hour + " : " + minute, Toast.LENGTH_SHORT).show();
                }
            }, hour, minute, true);
            timePickerDialog.show();
        });


        datePickerBtn.setOnClickListener(v -> {

            Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    Toast.makeText(getApplicationContext(), year + "/" + (month + 1) + "/" + dayOfMonth, Toast.LENGTH_SHORT).show();
                }
            },year, month, day );
            datePickerDialog.show();
        });


    }
}