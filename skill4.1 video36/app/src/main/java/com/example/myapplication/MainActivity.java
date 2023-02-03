package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView txtEti;
        Switch switche;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEti = (TextView) findViewById(R.id.etiSeleccion);
        switche = (Switch) findViewById(R.id.idSwitch);
    }

    public void onclick(View view){
        if (view.getId()==R.id.idSwitch){
            if(switche.isChecked()){
               txtEti.setText("fue activafo");
            }else{
                txtEti.setText("fue desactivado");
            }
        }
    }
}