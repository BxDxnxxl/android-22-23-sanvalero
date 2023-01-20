package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2;


    @Override
   protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1=findViewById(R.id.btnClaseAnonima);
        btn2=findViewById(R.id.btnImplements);
        btn2.setOnClickListener(this);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "desde la anonimia",Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==btn2.getId()){
            Toast.makeText(getApplicationContext(), "desde el onclick del implements",Toast.LENGTH_LONG).show();
        }
        if (v.getId()==R.id.btnonClick){

        }

        switch (v.getId()){
            case R.id.btnonClick:
                    Toast.makeText(getApplicationContext(), "desde el onclick del metodo",Toast.LENGTH_LONG).show();
                break;
            case R.id.btnImplements:
                    Toast.makeText(getApplicationContext(), "desde el onclick del implements",Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void eventoBoton(View view) {
        Toast.makeText(getApplicationContext(), "desde el onclick del implements",Toast.LENGTH_LONG).show();
    }
}
