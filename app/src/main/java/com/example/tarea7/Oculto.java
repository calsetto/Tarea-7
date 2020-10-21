package com.example.tarea7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Oculto extends AppCompatActivity {

    String correo;
    TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oculto);
        correo = getIntent().getStringExtra("Correo");
        label = (TextView)findViewById(R.id.textView5);
        label.setText("Bienvenido " + correo);
    }
}
