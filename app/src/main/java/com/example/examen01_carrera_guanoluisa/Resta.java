package com.example.examen01_carrera_guanoluisa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class Resta extends AppCompatActivity {

    EditText num1, num2;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        num1 = findViewById(R.id.num1R);
        num2 = findViewById(R.id.num2R);
        resultado = findViewById(R.id.ResultadoR);
    }

    public void resta(View view) {
        String num1String = num1.getText().toString();
        String num2String = num2.getText().toString();
        String resultadoResta = restaStrings(num1String, num2String);

        resultado.setText(num1String + "\n-" +
                num2String + "\n _____________________ \n" + resultadoResta);
    }

    private String restaStrings(String num1, String num2) {
        int maxLength = Math.max(num1.length(), num2.length());
        num1 = completarCeros(num1, maxLength);
        num2 = completarCeros(num2, maxLength);

        StringBuilder resultado = new StringBuilder();
        int carry = 0;

        for (int i = maxLength - 1; i >= 0; i--) {
            int digito1 = Character.getNumericValue(num1.charAt(i));
            int digito2 = Character.getNumericValue(num2.charAt(i));

            int resta = digito1 - digito2 - carry;

            if (resta < 0) {
                resta += 10;
                carry = 1;
            } else {
                carry = 0;
            }

            resultado.insert(0, resta);
        }

        while (resultado.length() > 1 && resultado.charAt(0) == '0') {
            resultado.deleteCharAt(0);
        }

        return resultado.toString();
    }
    private String completarCeros(String numero, int longitudObjetivo) {

        while (numero.length() < longitudObjetivo) {
            numero = "0" + numero;
        }
        return numero;
    }
}