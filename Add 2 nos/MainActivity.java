package com.example.add2numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText num1,num2,ans1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        btn=findViewById(R.id.btn);
        ans1=findViewById(R.id.ans1);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int x=Integer.parseInt(num1.getText().toString());
                int y=Integer.parseInt(num2.getText().toString());
                int sum=x+y;
                ans1.setText(String.valueOf(sum));
            }
        });
    }
}