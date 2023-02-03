package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView estado;
    Spinner comboDias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        estado = (TextView) findViewById(R.id.etiSeleccion);
        comboDias = (Spinner) findViewById(R.id.idSpinnerDias);

        ArrayList<String> comboDiasList = new ArrayList<String>();
        for(int i=0; i<10; i++){
            comboDiasList.add("Opcion"+ i);
        }


        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, comboDiasList);
        comboDias.setAdapter(adapter);
        comboDias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(parent.getContext(), 
                       "seleccionado : "+parent.getItemIdAtPosition(position).toString(), Toast.LENGTH_LONG).show();

               estado.setText("Seleccion: "+parent.getItemIdAtPosition(position).toString() );
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}