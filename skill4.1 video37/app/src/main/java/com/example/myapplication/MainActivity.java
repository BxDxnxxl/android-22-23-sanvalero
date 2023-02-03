package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "seguimiento";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info", "valor informacion");
        Log.d("Debug", "valor debug");
        Log.w("warning", "valor warning");
        Log.e("error", "valor error");
        Log.v("verbose", "Valor verbose");

        Log.i(TAG, "mensaje seguimiento1");
        Log.i(TAG, "mensaje seguimiento2");
        Log.i(TAG, "mensaje seguimiento3");
        Log.i(TAG, "mensaje seguimiento4");
        Log.i(TAG, "mensaje seguimiento5");
    }
}