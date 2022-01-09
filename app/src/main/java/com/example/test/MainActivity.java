package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber, secondNumber, result;
    Spinner spinnerOperator;
    Button equalBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.firstNumberEd);
        secondNumber = findViewById(R.id.secondNumberEd);
        result = findViewById(R.id.resultEd);
        spinnerOperator = findViewById(R.id.spinnerOperator);
        equalBtn = findViewById(R.id.equalBtn);

        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = Integer.parseInt(firstNumber.getText().toString());
                int y = Integer.parseInt(secondNumber.getText().toString());

                String operation = (String) spinnerOperator.getSelectedItem();

                if (operation.equals("+")){
                    result.setText(String.valueOf(x + y));
//                  result.setText(Integer.toString(x + y));
                }else if (operation.equals("-")){
                    result.setText(String.valueOf(x - y));
//                  result.setText(Integer.toString(x + y));
                }else if (operation.equals("/")){
                    result.setText(String.valueOf(x / y));
//                  result.setText(Integer.toString(x + y));
                }else if (operation.equals("*")){
                    result.setText(String.valueOf(x * y));
//                  result.setText(Integer.toString(x + y));
                }
            }
        });


    }
}