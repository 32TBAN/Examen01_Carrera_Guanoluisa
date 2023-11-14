package com.example.examen01_carrera_guanoluisa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class Suma extends AppCompatActivity {

    EditText num1, num2;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        num1 = findViewById(R.id.num1R);
        num2 = findViewById(R.id.num2R);
        resultado = findViewById(R.id.ResultadoR);
    }

    public void suma(View view){
        String num1String = num1.getText().toString();
        String num2String = num2.getText().toString();

        BigInteger numero1Grande = new BigInteger(num1String);
        BigInteger numero2Grande = new BigInteger(num2String);

        BigInteger resultadoSuma = numero1Grande.add(numero2Grande);

        resultado.setText(num1String+"\n"+
                num2String+"\n _____________________ \n"+ resultadoSuma.toString());
    }

    public void suma2(View view){
        String num1String = num1.getText().toString();
        String num2String = num2.getText().toString();

        for (int i = 0; i < num1String.length(); i++) {

        }

    }
}