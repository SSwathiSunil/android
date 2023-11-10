package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("on create called");

    }


    @Override
    protected void onStart(){
        super.onStart();
        showToast("on start called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showToast(" on restart called");
    }


    @Override
    protected void onResume() {
       super.onResume();
       showToast("on resume called");
    }

    @Override
    protected void onPause(){
         super.onPause();
         showToast("on pause called");
    }


    @Override
    protected void onStop() {
       super.onStop();
       showToast("on stop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("on destroy called");
    }
    private void showToast(String message){
        Toast.makeText( this,message,Toast.LENGTH_SHORT).show();
    }
}
