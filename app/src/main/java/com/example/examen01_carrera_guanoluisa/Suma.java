package com.example.examen01_carrera_guanoluisa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Suma extends AppCompatActivity {

    EditText num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
    }

    public void suma(View view){

    }
}