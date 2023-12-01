package com.example.indent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class indent2 extends AppCompatActivity {
    Button HOME;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indent2);
        Button HOME = findViewById(R.id.HOME);
        HOME.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(indent2.this,MainActivity.class);
                startActivity(intent);
                final TextView tv = findViewById(R.id.tv);

            }
        });
    }
}