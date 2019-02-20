package com.example.examenparcial;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView titulo1,descripcion1,titulo2,descripcion2,titulo3,descripcion3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titulo1=(TextView)findViewById(R.id.titulo1);
        titulo1.setText("Glass");
        descripcion1=(TextView)findViewById(R.id.descripcion1);
        descripcion1.setText("Secuela de split, un anciano cazando a un lunatico");
        titulo2=(TextView)findViewById(R.id.titulo2);
        titulo2.setText("Boku No Hero");
        descripcion2=(TextView)findViewById(R.id.descripcion2);
        descripcion2.setText("Estudiantes de una escuela de heores van a una isla");
        titulo3=(TextView)findViewById(R.id.titulo3);
        titulo3.setText("Angel Battle");
        descripcion3=(TextView)findViewById(R.id.descripcion3);
        descripcion3.setText("Un robot perfecto lucha contra todo el mundo");
    }
}