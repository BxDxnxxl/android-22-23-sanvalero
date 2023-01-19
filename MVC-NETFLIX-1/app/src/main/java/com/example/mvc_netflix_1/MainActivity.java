package com.example.mvc_netflix_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mvc_netflix_1.controller.StudentController;
import com.example.mvc_netflix_1.model.StudentWS;
import com.example.mvc_netflix_1.model.pojo.Student;
import com.example.mvc_netflix_1.vistacargada.verLogin;

public class MainActivity extends AppCompatActivity {
    private StudentController controller;
    private MainActivity view;
    private StudentWS model;
    verLogin ServiceLogin;

    private EditText name1;
    private EditText surname1;
    private Button buttpn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CARGAR VIEW
        view = this;
        // CARGAR MODEL
        // MODEL + VIEW
        controller = new StudentController(model, view);
        // CASO DE USO-> OBTENER ESTUDIANTE
            controller.getStudent();
    }

    public void printStudentDetails(Student student){
        Log.d("MainActivity - NAME",student.getName());
        Log.d("MainActivity - NAME",student.getSurname());
    }

    private void initComponents() {
        name1 = findViewById(R.id.name1);
        surname1 = findViewById(R.id.surname1);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = name1.getText().toString();
                String apellido = surname1.getText().toString();
                if (!nombre.equals("") && nombre.length() > 0 &&
                        !apellido.equals("") && apellido.length() > 0) {

                    ServiceLogin.verDatos(nombre, apellido);
                }
            }
        });
    }
    public static MainActivity getInstance(){
        if (view.getInstance() == null){
            view = new MainActivity();
        }
        return view;
    }
}