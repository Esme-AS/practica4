package com.example.practica4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cMes;
    TextView cResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cMes = findViewById(R.id.gMes);
        cResult = findViewById(R.id.gResul);

    }

    //Métodos
    public void Aceptar (View vista){

        //Variable
        int num;

        if (cMes.getText().toString().length() > 0 ){
            num = Integer.parseInt(cMes.getText().toString());

            switch (num){

                case 1:
                    cResult.setText("Enero ");
                    break;
                case 2:
                    cResult.setText("Febrero");
                    break;
                case 3:
                    cResult.setText("Marzo ♥♥♥");
                    break;
                case 4:
                    cResult.setText("Abril ♥♥♥");
                    break;
                case 5:
                    cResult.setText("Mayo");
                    break;
                case 6:
                    cResult.setText("Junio");
                    break;
                case 7:
                    cResult.setText("Julio ♥♥♥");
                    break;
                case 8:
                    cResult.setText("Agosto");
                    break;
                case 9:
                    cResult.setText("Septiembre");
                    break;
                case 10:
                    cResult.setText("Octubre ♥♥♥");
                    break;
                case 11:
                    cResult.setText("Nobiembre ♥♥♥♥ ");
                    break;
                case 12:
                    cResult.setText("Diciembre ♥");
                    break;

                default:
                    cResult.setText("Valor de Mes Invalido");
                    break;

            }

        }
        else {
        }
        Toast.makeText(this, "Debes ingresar un númeor de MEs", Toast.LENGTH_SHORT).show();
        }


    }


