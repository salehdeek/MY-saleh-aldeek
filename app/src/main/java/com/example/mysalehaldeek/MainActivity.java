package com.example.mysalehaldeek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button btn;
    private EditText num3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        btn=findViewById(R.id.btn);
        num3=findViewById(R.id.num3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 =num1.getText().toString();
                String number2 =num2.getText().toString();
                int x=Integer.parseInt(number1);
                int y=Integer.parseInt(number2);
              int r=x+y;
                num3.setText(String.valueOf(r));


            }
        });
    }
}