package com.example.examen01_carrera_guanoluisa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextPaint;
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

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        resultado = findViewById(R.id.Resultado);
    }

    public void suma(View view){
        String num1String = num1.getText().toString();
        String num2String = num2.getText().toString();

        BigInteger bigInteger1 = new BigInteger(num1String);
        BigInteger bigInteger2 = new BigInteger(num2String);

        BigInteger resultadoSuma = bigInteger1.add(bigInteger2);

        resultado.setText("Resultado: " + resultadoSuma.toString());
    }
}