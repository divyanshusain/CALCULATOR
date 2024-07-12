package com.dev.calculator1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text1;
    EditText text2;
    EditText ans;
    Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        ans = findViewById(R.id.ans);
        B1 = findViewById(R.id.B1);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = text1.getText().toString();
                String num2 = text2.getText().toString();

                if (!num1.isEmpty() && !num2.isEmpty()) {
                    double number1 = Double.parseDouble(num1);
                    double number2 = Double.parseDouble(num2);
                    double result = number1 + number2;

                    ans.setText(String.valueOf(result));
                } else {
                    Toast.makeText(getApplicationContext(), "Please enter both numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
