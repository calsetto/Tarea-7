package com.example.tarea7;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Registro extends Fragment {
    Button b;
    EditText correo, password;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.registro, container, false);
        b = (Button)view.findViewById(R.id.button);
        correo = (EditText)view.findViewById(R.id.editText);
        password = (EditText)view.findViewById(R.id.editText2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correo.getText().toString().isEmpty()){
                    AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                    builder.setTitle("Alerta");
                    builder.setMessage("Debes completar los campos.")
                            .setCancelable(true).show();
                }else if(correo.getText().toString().equals("eduardo@gmail.com") &&
                password.getText().toString().equals("123456")){
                    Intent i = new Intent(v.getContext(), Oculto.class);
                    i.putExtra("Correo", correo.getText().toString());
                    startActivity(i);
                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                    builder.setTitle("Alerta");
                    builder.setMessage("Ya has sido registrado.")
                            .setCancelable(true).show();

                    correo.setText("");
                    password.setText("");
                }
            }
        });
        return view;
    }
}
