package com.example.for2pay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //prueba de commit
    }
    public void SeleccionarElemento(Button v) {
        Button myText = new Button(this);
        myText.setText("Agregar Boton Ejecutado");
    }
}