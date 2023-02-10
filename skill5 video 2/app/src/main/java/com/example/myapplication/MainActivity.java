package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<PersonajeVo> listaPersonajes;
    RecyclerView recyclerPeronajes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaPersonajes = new ArrayList<>();
        recyclerPeronajes = (RecyclerView) findViewById(R.id.RecyclerId);
        recyclerPeronajes.setLayoutManager(new LinearLayoutManager(this));

        llenarPersonajes();
        AdaptadorPersonaje adapter = new AdaptadorPersonaje(listaPersonajes) ;
        recyclerPeronajes.setAdapter(adapter);
    }

    private void llenarPersonajes() {
        listaPersonajes.add(new PersonajeVo("Krusty", "", R.drawable.krusti));
        listaPersonajes.add(new PersonajeVo("Homer", "", R.drawable.homer));
        listaPersonajes.add(new PersonajeVo("Marge", "", R.drawable.marge));
        listaPersonajes.add(new PersonajeVo("Bart", "", R.drawable.bart));
        listaPersonajes.add(new PersonajeVo("Lisa", "", R.drawable.lisa));
        listaPersonajes.add(new PersonajeVo("Maggie", "", R.drawable.magie));
        listaPersonajes.add(new PersonajeVo("Flanders", "", R.drawable.flanders));
        listaPersonajes.add(new PersonajeVo("Milhouse", "", R.drawable.milhouse));
        listaPersonajes.add(new PersonajeVo("Burns", "", R.drawable.burns));
    }
}