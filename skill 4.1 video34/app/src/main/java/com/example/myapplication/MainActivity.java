package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (RadioButton) findViewById(R.id.idradio);
        r2 = (RadioButton) findViewById(R.id.idradio2);
    }

    public void onclick(View view){
        if (view.getId() == R.id.btn1){
            validar();
        }
    }

    private void validar() {
        String cad="Seleccionado: \n";
        if (r1.isChecked()==true){
            cad+="opcion1\n";
        }

        if (r2.isChecked()==true){
            cad+="opcion2\n";
        }
        Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_SHORT).show();
    }
}