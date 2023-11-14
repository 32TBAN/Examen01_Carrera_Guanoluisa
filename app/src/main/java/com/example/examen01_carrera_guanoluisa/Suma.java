package com.example.examen01_carrera_guanoluisa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Suma extends AppCompatActivity {

    EditText num1, num2;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        num1 = findViewById(R.id.num1GK);
        num2 = findViewById(R.id.num2GK);
        resultado = findViewById(R.id.ResultadoGK);
    }

    public void suma(View view) {
        String num1String = num1.getText().toString();
        String num2String = num2.getText().toString();

        if(num1String.isEmpty() || num2String.isEmpty()){
            Toast.makeText(this,"ERROR no hay numeros",Toast.LENGTH_SHORT).show();
        }else{
            if(validarRango(num1String) && validarRango(num2String)){
                String resultadoSuma = sumaStrings(num1String, num2String);

                String linea = "";
                for (int i = 0; i < num1String.length(); i++) {
                    linea += "_";
                }
                resultado.setText(num1String + "\n+" +
                        num2String + "\n"+linea+"  \n" + resultadoSuma);
            }
        }

    }

    private String sumaStrings(String num1, String num2) {
        int maxLength = Math.max(num1.length(), num2.length());
        num1 = completarCeros(num1, maxLength);
        num2 = completarCeros(num2, maxLength);

        StringBuilder resultado = new StringBuilder();
        int carry = 0;

        for (int i = maxLength - 1; i >= 0; i--) {
            int digito1 = Character.getNumericValue(num1.charAt(i));
            int digito2 = Character.getNumericValue(num2.charAt(i));

            int suma = digito1 + digito2 + carry;

            resultado.insert(0, suma % 10);

            carry = suma / 10;
        }

        if (carry > 0) {
            resultado.insert(0, carry);
        }

        return resultado.toString();
    }

    private String completarCeros(String numero, int longitudObjetivo) {

        while (numero.length() < longitudObjetivo) {
            numero = "0" + numero;
        }
        return numero;
    }

    private boolean validarRango(String numero) {
        if (numero.charAt(0) == '0' || numero.charAt(0) == '-') {
            Toast.makeText(this,"Numero 0 o negativo",Toast.LENGTH_SHORT).show();
            return false;
        }

        if (numero.length() < 200) {
            return true;
        } else if (numero.length() > 200) {
            Toast.makeText(this,"Fuera de rango",Toast.LENGTH_SHORT).show();
            return false;
        }

        String maximo = "10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";

        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) < maximo.charAt(i)) {
                return true;
            } else if (numero.charAt(i) > maximo.charAt(i)) {
                Toast.makeText(this,"Fuera de rango",Toast.LENGTH_SHORT).show();
                return false;
            }
        }

        return true;
    }

}