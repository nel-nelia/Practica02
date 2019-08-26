package com.example.practica02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_Aceptar = (Button)findViewById(R.id.btn_Aceptar);

        btn_Aceptar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                EditText pal1= (EditText)findViewById(R.id.txt_pal1);
                EditText pal2= (EditText)findViewById(R.id.txt_pal2);
                EditText comparar= (EditText)findViewById(R.id.txt_comparar);
                String text1 = pal1.getText().toString();
                String text2 = pal2.getText().toString();

                if(text1.equals("") || text2.equals(""))
                {
                    String completar = getString(R.string.completar);
                    Toast.makeText(getApplicationContext(),completar,Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (text1.equals(text2)) {
                        String iguales = getString(R.string.igual);
                        comparar.setText(iguales);
                    } else {
                        String diferentes = getString(R.string.distinto);
                        comparar.setText(diferentes);
                    }

                    int contador1 = 0;
                    int contador2 = 0;

                    EditText vocales1 = (EditText) findViewById(R.id.txt_voc1);
                    EditText vocales2 = (EditText) findViewById(R.id.txt_voc2);

                    for (int i = 0; i < text1.length(); i++) {
                        if ((text1.charAt(i) == 'i') || (text1.charAt(i) == 'u') || (text1.charAt(i) == 'I') || (text1.charAt(i) == 'U')) {
                            contador1++;
                        }
                    }
                    String vocales_texto1 = getString(R.string.vocales_texto1);
                    vocales1.setText(vocales_texto1 + " " + contador1);

                    for (int j = 0; j < text2.length(); j++) {
                        if ((text2.charAt(j) == 'i') || (text2.charAt(j) == 'u') || (text1.charAt(j) == 'I') || (text1.charAt(j) == 'U')) {
                            contador2++;
                        }
                    }
                    String vocales_texto2 = getString(R.string.voc_text2);
                    vocales2.setText(vocales_texto2 + " " + contador2);
                }
            }
        });
    }


}
