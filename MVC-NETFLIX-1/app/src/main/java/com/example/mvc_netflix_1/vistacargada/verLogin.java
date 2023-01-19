package com.example.mvc_netflix_1.vistacargada;

import android.widget.Toast;

import com.example.mvc_netflix_1.MainActivity;

public class verLogin {
    static MainActivity mainActivity;
    public static void verDatos(String verNombre, String verApellido){
        Toast.makeText(mainActivity.getInstance, "Email y Password correctas", Toast.LENGTH_SHORT).show();
    }

}
