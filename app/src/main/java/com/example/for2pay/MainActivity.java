package com.example.for2pay;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //prueba de commit
    }
    public void agregarElemento(View vista) {
        LinearLayout contenedor = new LinearLayout(vista.getContext());
        contenedor.setLayoutParams(new LinearLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
        contenedor.setOrientation(LinearLayout.VERTICAL);

        TextView elemento = new TextView(getApplicationContext());
        elemento.setText("Shell 14/11 $3000");
        elemento.setBackgroundColor(Color.YELLOW);

        contenedor.addView(elemento);

        FrameLayout.LayoutParams params;
        params = new FrameLayout.LayoutParams(400, 1500, Gravity.CENTER);

        addContentView(contenedor, params);

    }
}