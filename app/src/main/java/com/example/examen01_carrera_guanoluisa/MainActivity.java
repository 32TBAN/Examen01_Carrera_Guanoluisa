package com.example.examen01_carrera_guanoluisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSuma(View view){
        Intent intent = new Intent(this,Suma.class);
        startActivity(intent);
    }

    public void onClickResta(View view){
        Intent intent = new Intent(this,Resta.class);
        startActivity(intent);
    }
}