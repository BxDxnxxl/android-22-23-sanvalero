package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MensajeActivity extends AppCompatActivity {

    TextView msj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        msj = (TextView) findViewById(R.id.txtNombreMsj);

        Bundle miBundle = this.getIntent().getExtras();

        if (miBundle!=null){

            String nombre= miBundle.getString("nombre");
            String msj_String = getString(R.string.tewxt_msj_bienvenido);
            msj.setText(msj_String+ " "+ nombre);
        }

    }

    public void onclick(View view){
        finish();
    }
}