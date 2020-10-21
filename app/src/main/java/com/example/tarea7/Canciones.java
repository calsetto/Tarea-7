package com.example.tarea7;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Canciones extends Fragment implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4, btn5;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.canciones, container, false);
        btn1 = (Button)view.findViewById(R.id.btn1);
        btn2 = (Button)view.findViewById(R.id.btn2);
        btn3 = (Button)view.findViewById(R.id.btn3);
        btn4 = (Button)view.findViewById(R.id.btn4);
        btn5 = (Button)view.findViewById(R.id.btn5);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        final String CANCIOON_1 = "https://www.youtube.com/watch?v=ytFzsNGCdes&ab_channel=Ozuna";
        final String CANCIOON_2 = "https://www.youtube.com/watch?v=2laXP1SufrY&ab_channel=JayWheeler";
        final String CANCIOON_3 = "https://www.youtube.com/watch?v=9tFfffFVv2U&ab_channel=JayWheeler";
        final String CANCIOON_4 = "https://www.youtube.com/watch?v=puugRJxgdt4&ab_channel=FARRUKOVEVO";
        final String CANCIOON_5 = "https://www.youtube.com/watch?v=il_E30X0wsY&ab_channel=Arcangel";
        Intent i = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()){
            case R.id.btn1:
                i.setData(Uri.parse(CANCIOON_1));
                startActivity(i);
                break;
            case R.id.btn2:
                i.setData(Uri.parse(CANCIOON_2));
                startActivity(i);
                break;
            case R.id.btn3:
                i.setData(Uri.parse(CANCIOON_3));
                startActivity(i);
                break;
            case R.id.btn4:
                i.setData(Uri.parse(CANCIOON_4));
                startActivity(i);
                break;
            case R.id.btn5:
                i.setData(Uri.parse(CANCIOON_5));
                startActivity(i);
                break;
        }
    }
}
