package com.example.parcialactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvParcial;

    private EditText texto ;
    private RadioButton guardar, mostrar;
    private Button btnGuardar, btnMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvParcial = findViewById(R.id.tvParcial);
        texto = findViewById(R.id.ETtexto);
        guardar = findViewById(R.id.rbGuardar);
        mostrar = findViewById(R.id.rbMostrar);
        btnGuardar = findViewById(R.id.btnGuardar);
        btnMostrar = findViewById(R.id.rbMostrar);




    }
}